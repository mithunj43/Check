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
            steps{
                withMaven(maven:'maven'){
                    sh 'pwd'
                    sh 'mvn install -DskipTests'
                }
            }
        }
    }
}
