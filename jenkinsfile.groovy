pipeline {
    agent any
    stages {
         stage('Dynamically create the inventory file for ansible') {
            steps {
            sh "python dynamicInventory.py Blue-Green-deploymentStack us-east-1"
              }
           
             }
            }
            }
