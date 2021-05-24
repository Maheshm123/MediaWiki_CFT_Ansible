pipeline {
    agent any
    stages {
        stage('Git Clone') {
            steps {
            sh "git branch: 'main', credentialsId: 'Mahesh_Git', url: 'https://github.com/Maheshm123/MediaWiki_CFT_Ansible.git'"
              }
        stage('Submit Stack') {
            steps {
            sh "/usr/local/bin/aws cloudformation create-stack --stack-name Blue-Green-deploymentStack --template-body file://./blueGreen.yaml --region 'us-east-1'"
              }
           
             }
            }
            }
