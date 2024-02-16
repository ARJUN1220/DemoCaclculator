pipeline{
    agent any
    tools{
        maven 'maven'
    }
    stages{
        stage('clone git'){
            steps{
                git 'https://github.com/ARJUN1220/DemoCaclculator.git'
            }
        }
        stage('Build maven'){
            steps{
                sh 'maven clean install'
            }
        }
    }
}