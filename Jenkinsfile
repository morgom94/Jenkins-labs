pipeline {
    agent any

    parameters {
        booleanParam(defaultValue: true, description: 'trying out a parameter', name: 'userFlag')
        string(defaultValue: "MASTER", description: 'What environment?', name: 'userFlag2')
        choice(choices: ['US-EAST-1', 'US-WEST-2'], description: 'What AWS region?', name: 'region')
   
    }
    /*triggers {
        upstream(upstreamProjects: "1Regression", threshold: hudson.model.Result.SUCCESS)
    }*/

    stages {
        stage('Hello from the Master Branch') {
            steps {
                echo 'Hello World this is the Master Branch'
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
