pipeline {
    agent any
    stages {
        stage('checkout') {
            steps {
                git branch: 'master', url: 'https://github.com/morgom94/gitops-terraform-jenkins'
            }
        }
    stage('Set Terraform path') {
        steps {
            script {
                def tfHome = tool name: 'Terraform'
                env.PATH = "${tfHome}:${env.PATH}"
            }
            echo '\nPrinting the Terraform version'
            bat 'terraform --version'
        }
    }
    stage('Provision infrastructure') {
        steps {
            dir('dev')
            {
                echo '\n\nInitializing... \nLooking for *.tf files'
                bat 'terraform init'
                bat 'terraform plan -out=plan'
                bat 'terraform apply -input=false'
            }
        }
    }
 }
}
