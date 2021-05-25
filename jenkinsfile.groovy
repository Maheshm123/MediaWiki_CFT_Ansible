pipeline {
    agent any
    stages {
        stage('Submit Stack') {
           steps {
             sh "/usr/local/bin/aws cloudformation create-stack --stack-name Blue-Green-deploymentStack --template-body file://./rollingUpdate.yaml --region 'us-east-1'"
              }

             }
             stage('Installing Mediawiki setup using ansible') {
                 steps {
                 sh "ansible-playbook playbook.yaml -u root"
                   }

                  }
            }
            }
