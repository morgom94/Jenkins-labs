pipeline {
    agent any
    stages {
        stage('Clone Repository') {
            steps {
                //bat 'del /f /Q my-app'
                bat 'git clone https://github.com/pknowledge/my-app.git'
                bat 'mvn clean -f my-app'
                echo ''
            }
        }
        stage("Testing") {
            steps {
                bat 'mvn test -f my-app'
            }
        }
        stage("Deploying"){
            steps{
                bat 'mvn package -f my-app'
            }
        }
    }
}
