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
        stage('build image'){
              steps{
                  dir('target'){
                      def app = docker.build "localhost:5000/account-service:${env.version}"
                  }

              }
        }
    }
}



