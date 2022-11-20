pipeline {
    agent any

    tools {
        maven "Maven-3.8.1"
        jdk "Java-11"
    }

    stages {

        stage ('Initialize Tools'){
            steps {
                sh '''
                    echo "PATH = ${PATH}"
                    echo "MAVEN_HOME = ${MAVEN_HOME}"
                '''
            }
        }
        stage('Build') {
            steps {
                echo 'Building the pipeline'
            }
        }

        stage('deploy') {
            steps {
                echo 'Deploying the pipeline'
            }
        }

    }
}