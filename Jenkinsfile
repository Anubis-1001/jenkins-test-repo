def gv

pipeline {

    agent any

    parameters {
        choice(name: "Version", choices: ["1.10.0","1.20.0" ,"1.30.0" ], description: "which version to deploy")
        booleanParam(name: "execTests", defaultValue: true, description: "determines if we run tests")
    }
    options {
        buildDiscarder(logRotator(numToKeepStr:’3’))
    }

    environment {
        VERSION = "1.3.5"
//        CREDENTIALS = credentials('80233fed-aa3c-4b5d-af9f-2796c55cac01')
    }

    stages {

        stage("build") {
            steps {
                script {
                    gv = load "script.groovy"
                }
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
                script {
                    gv.testApp()
                }

                echo "jenkins url is ${JENKINS_URL}"
            }
        }

        stage("deploy") {
            steps {
                script {
                    gv.deployApp()
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