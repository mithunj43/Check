node{
    stage('SCM checkout'){
        git url :'https://github.com/mithunj43/Check'
    }
    stage('Mvn clear'){
        sh "mvn clean"

    }
    stage('MVN install'){
        sh "mvn install -DskipTests"
    }
}