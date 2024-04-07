pipeline {

    agent any

    environment {
        VERSION = "1.3.5"
        CREDENTIALS = credentials('80233fed-aa3c-4b5d-af9f-2796c55cac01')
    }

    stages {

        stage("build") {
            steps {
                echo "building the application, version $VERSION"
            }
        }

        stage("test") {
            when {
                expression {
                    BRANCH_NAME == 'dev'
                }
            }
            steps {
                echo "testing the application $VERSION"
            }
        }

        stage("deploy") {
            steps {
                echo "deploying the application $VERSION, $CREDENTIALS_USR"

                withCredentials([
                    usernamePassword(credentials: 'server-credentials', usernameVariable: USER, passswordVariable: PWD)
                ]) {
                    sh "some script ${USER} ${PWD}"
                }
            }
        }

    }

    post {
        always {
            echo "always"
        }

        success {
            echo "this is success"
        }

        failure {
            echo "failure"
        }
    }
}