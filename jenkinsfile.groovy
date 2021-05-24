pipeline {
    agent any
    stages {
        #stage('Submit Stack') {
         #   steps {
          #  sh "/usr/local/bin/aws cloudformation create-stack --stack-name Blue-Green-deploymentStack --template-body file://./blueGreen.yaml --region 'us-east-1'"
           #   }
           #
            # }
        stage('Dynamically create the inventory file for ansible') {
            steps {
            sh "python dynamicInventory.py Blue-Green-deploymentStack us-east-1"
              }
           
             }
            }
            }
