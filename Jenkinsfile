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
                    echo "JAVA_HOME = ${JAVA_HOME}"
                    echo "MAVEN_HOME = ${MAVEN_HOME}"
                '''
            }
        }
        stage('Build') {
            steps {
                sh '''
                    mvn clean package
                    echo 'Pipeline build complete'
                '''
            }
        }

        stage('deploy') {
            steps {
                sh '''
                    echo 'Deploying and running locally'
                    java -jar target/FindAContactApp.jar
                    echo 'Will be deployed in Docker later'
                '''
            }
        }

    }
}