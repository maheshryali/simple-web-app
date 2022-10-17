pipeline {
    agent { label 'SIMPLE'}
    stages {
        stage('git') {
            steps {
                git branch: 'master',
                       url: 'https://github.com/maheshryali/simple-web-app.git'
            }
        }
        stage('maven') {
            steps {
                sh 'mvn package'
            }
        }
        }
    }
