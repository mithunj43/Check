node{
    stage('SCM checkout'){
        git url :'https://github.com/mithunj43/Check'
    }
    stage('Mvn package'){
        sh "mvn clean package"
    }
}