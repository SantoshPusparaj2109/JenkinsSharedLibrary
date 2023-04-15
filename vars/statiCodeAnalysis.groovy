def call(credentialsId){
    withSonarQubeEnv(credentialsId: 'sonarid') {
         sh 'mvn clean package sonar:sonar'
    }
}