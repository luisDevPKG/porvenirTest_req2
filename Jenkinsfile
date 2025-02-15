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
                -Dcucumber.options="--plugin pretty --glue src/test/java/stepDefinitions src/test/resources/features -Dverbose=true"
                '''
            }
        }

        stage("Mensaje Final") {
            steps {
                echo "Pipeline ejecutado con éxito 🎉"
            }
        }
    }

}
