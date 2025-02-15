pipeline {
    agent any

    tools {
        maven "Maven"
    }

    environment {
         HEADLESS_OPTS = "--headless --disable-gpu --window-size=1920x1080 --no-sandbox --disable-dev-shm-usage"
    }

    stages {
        stage('Checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/luisDevPKG/porvenirTest_req2.git'
            }
        }

        stage('Build & Test') {
            steps {
                sh '''
                mvn clean verify \
                -Dwebdriver.driver=chrome \
                -Dchrome.switches="$HEADLESS_OPTS" \
                -Dserenity.outputDirectory=target/serenity-reports
                '''
            }
        }

        stage("Verificar Reportes") {
            steps {
                sh 'ls -R target/serenity-reports || echo "No se generaron reportes"'
            }
        }

        stage("Imprimo cosas") {
            steps {
                echo "Aqui va un stage aparte"
            }
        }
    }
}
