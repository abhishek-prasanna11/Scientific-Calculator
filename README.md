# Scientific Calculator CI/CD Pipeline

## Overview
This project implements a CI/CD pipeline for a Java-based Scientific Calculator application.  
The pipeline automates the process of building, testing, containerizing, and deploying the application using DevOps tools.

---

## Technologies Used
- GitHub – Source code repository  
- Jenkins – CI/CD automation  
- Maven – Build and dependency management  
- Docker – Containerization  
- Docker Hub – Image registry  
- Ansible – Automated deployment  
- Java (JDK 17) – Application runtime  

---

## Application
The application is a Java-based Scientific Calculator that supports arithmetic and scientific operations.  
It is built using Maven and packaged as a JAR file.

---

## CI/CD Workflow
1. Code is pushed to GitHub  
2. Jenkins pipeline is triggered  
3. Maven compiles and tests the application  
4. Application is packaged into a JAR file  
5. Docker image is built and pushed to Docker Hub  
6. Ansible deploys the latest container  

---

## Project Structure

```
Scientific-Calculator/
│
├── src/
├── pom.xml
├── Jenkinsfile
├── Dockerfile
├── ansible/
│   └── deploy.yml
└── README.md
```

---

## Conclusion
This project demonstrates a fully automated DevOps pipeline integrating GitHub, Jenkins, Docker, and Ansible to streamline software build and deployment.
