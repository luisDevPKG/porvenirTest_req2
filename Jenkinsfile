pipeline {
    // en que agente esto va a estar corriendo
    agent any

    // Que herramientas vamos a estar instalando al prinicipio
    tools {
        // Install the Maven version configured as "M3" and add it to the path.
        maven "Maven"
    }

    environment {
        // Configurar Serenity para headless mode
        HEADLESS_OPTS = "--headless --disable-gpu --window-size=1920x1080 --no-sandbox --disable-dev-shm-usage"
    }

    stages {
        stage('Build') {
            steps {
                // Agarrar el repositorio en el que esta el codigo que se va a correr
                git branch: 'main', url: 'https://github.com/luisDevPKG/porvenirTest_req2.git'

                // Run Maven clean.
                sh '''
                mvn clean test -Dcucumber.options="classpath:features"
                '''

                //mvn clean verify \
                // -Dwebdriver.driver=chrome \
                // -Dchrome.switches="$HEADLESS_OPTS"

                // To run Maven on a Windows agent, use
                // bat "mvn -Dmaven.test.failure.ignore=true clean package"
            }
        }
        stage("Imprimo cosas"){
            steps{
                echo "Aqui va un stage aparte"
            }
        }
    }
}