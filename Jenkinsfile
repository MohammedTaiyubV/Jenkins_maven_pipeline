pipeline {
    agent any

    stages {

        stage('Build') {
            steps {
                bat 'mvn package'
                echo 'Build success'
            }
        }

        stage('Execute') {
            steps {
                bat 'java -jar target/java-project2-1.1.jar'
            }
        }

        stage('Final') {
            steps {
                echo 'Success'
            }
        }

    }
}
