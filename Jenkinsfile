pipeline {
    agent any

    parameters {
        booleanParam(defaultValue: true, description: 'trying out a parameter', name: 'userFlag')
        string(defaultValue: "SECOND", description: 'What environment?', name: 'userFlag2')
        choice(choices: ['US-EAST-1', 'US-WEST-2'], description: 'What AWS region?', name: 'region')
   
    }

    stages {
        stage('Hello from Second Branch') {
            steps {
                echo 'Hello World, this is the Jenkinsfile from second branch'
            }
        }
        stage("Parameters") {
            steps {
                echo "flag: ${params.userFlag}"
                echo "flag: ${params.userFlag2}"
                echo "flag: ${params.region}"
            }
        }
    }
}
