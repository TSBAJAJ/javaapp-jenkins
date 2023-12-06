pipeline{
  agent any

  stages {
    stage('maven install') {
      steps {
        withMaven(globalMavenSettingsConfig: '', jdk: 'jdk11', maven: 'maven', mavenSettingsConfig: '', traceability: true) {
           bat 'mvn clean install'
        }
      }
    }
    
    stage('Deployment'){
       steps {
        deploy adapters: [tomcat9(credentialsId: '1a297863-a901-463a-bb8f-914da16ccd1a', path: '', url: 'http://localhost:8081/')], contextPath: 'javaweb-jenkins', war: 'target/*.war'
       }
    }
  }
}
