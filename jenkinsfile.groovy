pipeline {
    agent any
    stages {
        stage('Submit Stack') {
            steps {
            sh "/usr/local/bin/aws cloudformation update-stack --stack-name demo-stack --template-body file://./blueGreen.yaml --region 'us-east-1'"
              }
             }
            }
            }
