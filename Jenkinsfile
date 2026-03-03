pipeline {
    agent any

    tools {
        maven 'Maven'
        jdk 'JDK17'
    }

    stages {

        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Compile') {
            steps {
                sh 'mvn clean compile'
            }
        }

        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }

        stage('Package') {
            steps {
                sh 'mvn package'
            }
        }
    }

    post {
        success {
            mail to: 'abhishek.prasanna@iiitb.ac.in',
                 subject: "Build SUCCESS - ${env.JOB_NAME}",
                 body: "Build completed successfully."
        }
        failure {
            mail to: 'abhishek.prasanna@iiitb.ac.in',
                 subject: "Build FAILED - ${env.JOB_NAME}",
                 body: "Build failed. Check Jenkins console output."
        }
    }
}
