pipeline {
    agent any

    tools {
        maven "Maven-3.8.1"
        jdk "Java-11"
    }

    stages {

        stage ('Initialize'){
            steps {
                sh '''
                    echo "PATH = ${PATH}"
                    echo "M2_HOME = ${M2_HOME}"
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