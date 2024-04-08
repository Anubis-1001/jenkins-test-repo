pipeline {

    agent {
         docker {
            image 'python:3.9' 
            args '-v /home/anubis/PythonScript:/scripts' 
        }
    }
    parameters {
        choice(name: "Version", choices: ["1.10.0","1.20.0" ,"1.30.0" ], description: "which version to deploy")
        booleanParam(name: "execTests", defaultValue: true, description: "determines if we run tests")
    }

    environment {
        VERSION = "1.3.5"
        CREDENTIALS = credentials('80233fed-aa3c-4b5d-af9f-2796c55cac01')
    }

    stages {

        stage("build") {
            steps {
                echo "building the application, version $VERSION"
                sh "python3 /scripts/script1.py"
            }
        }

        stage("test") {
            when {
                expression {
                    //BRANCH_NAME == 'dev'
                    params.execTests
                }
            }
            steps {
                echo "testing the application $VERSION"
            }
        }

        stage("deploy") {
            steps {
                echo "deploying the application $VERSION,"
                echo "deploying version ${Version}"

                withCredentials([
                    usernamePassword(credentials: 'server-credentials', usernameVariable: USER, passswordVariable: PWD)
                ]) {
                    
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