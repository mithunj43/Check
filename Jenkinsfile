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
    stage('build docker image'){
        sh 'docker  build -t mithunj43/check:checktag .'
    }
    stage('push docker image to hub'){
        sh 'docker push mithunj43/check:checktag'
    }
}