pipeline {
    agent any

    stages {
        stage('Checkout SCM') {
            steps {
               git 'https://github.com/mohit12390/TodoApp.git'
            }
        }
        
         stage('Compile') {
            steps {
            bat 'mvn compile'
            }
        }
        
         stage('Test') {
            steps {
            bat 'mvn test'
            }
        }
        
         stage('Package') {
            steps {
            bat 'mvn package'
            }
        }
        
        stage('Deploy') {
            steps {
        deploy adapters: [tomcat9(credentialsId: 'tomcat', path: '', url: 'http://localhost:8085/')], contextPath: 'TodoApp', war: '**/*.war'
                }
        }
        
    }
    
   
}
