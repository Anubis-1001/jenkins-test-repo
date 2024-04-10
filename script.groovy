def buildApp(){
    echo 'building app from a groovy script 2'
}

def testApp(){
    echo 'testing app from a groovy script 2'
}

def deployApp(){
    echo 'deploying app from a groovy script 2'
    echo "deploying version ${params.Version}"
}

return this