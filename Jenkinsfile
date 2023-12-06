pipeline{
  agent any

  stages {
    stage('maven install') {
      steps {
        withMaven(globalMavenSettingsConfig: '', jdk: 'jdk11', maven: 'maven', mavenSettingsConfig: '', traceability: true) {
    // some block
        }
      }
    }
  }
}
