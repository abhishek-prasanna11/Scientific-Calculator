Scientific Calculator CI/CD Pipeline
Overview
This project implements a CI/CD pipeline for a Java-based Scientific Calculator application. The pipeline automates the process of building, testing, containerizing, and deploying the application using DevOps tools.
Technologies Used
GitHub – source code repository
Jenkins – CI/CD automation
Maven – build and dependency management
Docker – containerization
Docker Hub – image registry
Ansible – automated deployment
Java (JDK 17) – application runtime
Application
The application is a Java-based Scientific Calculator that supports arithmetic and scientific operations. It is built using Maven and packaged as a JAR file.
CI/CD Workflow
Code is pushed to GitHub
Jenkins pipeline is triggered
Maven compiles and tests the application
Application is packaged into a JAR file
Docker image is built and pushed to Docker Hub
Ansible deploys the latest container
Project Structure
Scientific-Calculator/
│
├── src/
├── pom.xml
├── Jenkinsfile
├── Dockerfile
├── ansible/deploy.yml
└── README.md
Conclusion
This project demonstrates a fully automated DevOps pipeline that integrates GitHub, Jenkins, Docker, and Ansible to streamline software build and deployment.
