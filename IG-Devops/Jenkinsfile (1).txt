pipeline {
    agent any
    tools {
        maven 'maven1'
    }
    stages {
        stage('Maven clean') {
            steps {
                
                    sh 'mvn clean'
                }
            }

         stage('Build') {
            steps {
                echo 'Build stage'
            }
        }
        stage('Test') {
            steps {
                echo 'Test'
            }
        }
        stage('Scan') {
            steps {
                echo 'Scan'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploy'
            }
        }
         stage('Monitor') {
            steps {
                echo 'Monitor'
            }
        }
        
        }
    }

