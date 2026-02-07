pipeline {
    agent any
    tools {
        maven 'Maven_3.9.12'
    }
    stages {
        stage('Build') {
            steps {
                bat 'mvn clean install'
            }
        }
        stage('Test') {
            steps {
                bat 'mvn test'
            }
        }
    }
}