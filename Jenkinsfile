pipeline {
    agent any
    stages {
        stage('checkout') {
            steps {
                git branch: 'master', url: 'https://github.com/morgom94/Terraform-labs'
            }
        }
        stage('Set Terraform path') {
            steps {
                script {
                    def tfHome = tool name: 'Terraform'
                    env.PATH = "${tfHome}:${env.PATH}"
                    echo "env.PATH"
                }
                echo '\nPrinting the Terraform version'
                bat 'terraform --version'
            }
        }
        stage('Initializing') {
            steps {
                    echo '\n\nLooking for *.tf files'
                    bat 'terraform init'
            }
        }
        stage('Planning') {
            steps {
                bat 'terraform plan'
            }
        }
        stage('Applying') {
            steps {
                bat 'terraform apply'
            }
        }
    }
}
