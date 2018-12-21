pipeline{
    agent any
    stages{
        stage('clean stage'){
            steps{
                 withMaven(maven:'maven'){
                    sh 'mvn clean'
                 }
            }
        }
        stage('build stage'){
            withMaven(maven:'maven'){
                sh 'mvn install -DskipTests'
            }
        }
    }
}
