def call(){
    sh 'mvn clean'
    sh 'mvn install'
    sh 'mvn test'
}