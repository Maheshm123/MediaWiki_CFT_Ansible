pipeline {
    agent any
    stages {
         stage('Dynamically create the inventory file for ansible') {
            steps {
            sh "ansible-playbook playbook.yaml"
              }
           
             }
            }
            }
