pipeline {
    agent any
    stages {
        stage('Submit Stack') {
            steps {
            sh "/usr/local/bin/aws cloudformation create-stack --stack-name Blue-Green-deploymentStack --template-body file://./blueGreen.yaml --region 'us-east-1'"
              }
           
             }
            }
            }
