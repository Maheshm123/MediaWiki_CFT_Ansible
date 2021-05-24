pipeline {
    agent any
    stages {
        stage('Submit Stack') {
            steps {
            sh "aws cloudformation create-stack --stack-name demo-stack --template-body blueGreen.yaml --region 'us-east-1'"
              }
             }
            }
            }
