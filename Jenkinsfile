pipeline {
    agent any

    tools {
        maven 'Maven'
        jdk 'JDK17'
    }

    environment {
        DOCKER_IMAGE = "abhishekprasanna1109/scientific-calculator:latest"
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

        stage('Docker Build') {
            steps {
                sh 'docker build -t $DOCKER_IMAGE .'
            }
        }

        stage('Docker Push') {
            steps {
                withCredentials([usernamePassword(
                    credentialsId: 'dockerhub-token',
                    usernameVariable: 'DOCKER_USER',
                    passwordVariable: 'DOCKER_PASS'
                )]) {
                    sh '''
                    echo $DOCKER_PASS | docker login -u $DOCKER_USER --password-stdin
                    docker push $DOCKER_IMAGE
                    '''
                }
            }
        }
    }

    post {
        success {
            emailext(
                to: 'abhishek.prasanna@iiitb.ac.in',
                subject: "Build SUCCESS - ${env.JOB_NAME}",
                body: "Docker image built and pushed successfully."
            )
        }

        failure {
            emailext(
                to: 'abhishek.prasanna@iiitb.ac.in',
                subject: "Build FAILED - ${env.JOB_NAME}",
                body: "Build failed. Check Jenkins console."
            )
        }
    }
}
