pipeline{
    agent any
    tools{
        maven 'maven'
    }
    stages{
        stage('Build maven'){
            steps{
                checkout scmGit(branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/ARJUN1220/DemoCaclculator.git']])
                sh 'mvn clean install'
            }
        }
    }
}