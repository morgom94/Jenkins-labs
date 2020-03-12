pipeline {
    agent any
    stages {
        stage('Clone Repository') {
            steps {
                //bat 'RD C:\\Users\\erick.morales\\.jenkins\\workspace\\ExampleMultiBranch_workflow\\my-app /S /Q'
                bat 'git clone https://github.com/pknowledge/my-app.git'
                bat 'mvn clean -f my-app'
            }
        }
        stage("Testing...") {
            steps {
                bat 'mvn test -f my-app'
            }
        }
        stage("Deploying..."){
            steps{
                bat 'mvn package -f my-app'
            }
        }
    }
}
