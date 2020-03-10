pipeline {
    agent any

    parameters {
        booleanParam(defaultValue: true, description: 'trying out a parameter', name: 'userFlag')
        string(defaultValue: "TEST", description: 'What environment?', name: 'userFlag2')
        choice(choices: ['US-EAST-1', 'US-WEST-2'], description: 'What AWS region?', name: 'region')
   
    }
    
    /*triggers {
        upstream(upstreamProjects: "1Regression", threshold: hudson.model.Result.SUCCESS)
    }*/

    stages {
        stage('Hello') {
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
        /*stage ('Starting downstream job ') {
            steps {
                build job: 'Terraform Output Var'
            }
        }*/
    }
}
