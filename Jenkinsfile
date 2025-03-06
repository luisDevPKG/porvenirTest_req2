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
                sh 'pwd'  // Imprime el directorio de trabajo
                sh 'ls -la src/test/resources/features'  // Verifica que la carpeta de características esté presente
                sh 'mvn clean install'
            }
        }
        stage("Mensaje Final") {
            steps {
                echo "Pipeline ejecutado con éxito 🎉"
            }
        }
    }
}
