pipeline {
    agent any

    tools {
        maven "Maven"
    }

    stages {
        stage('Checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/luisDevPKG/porvenirTest_req2.git'
            }
        }

        stage('Build & Test') {
            steps {
                sh 'mvn clean verify -Dcucumber.options="--plugin pretty --glue src/test/java/stepDefinitions --features src/test/resources/features -Dverbose=true"'
            }
        }

        stage("Mensaje Final") {
            steps {
                echo "Pipeline ejecutado con éxito 🎉"
            }
        }
    }

}
