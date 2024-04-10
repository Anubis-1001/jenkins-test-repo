def buildApp(){
    echo 'building app from a groovy script 3'
}

def testApp(){
    echo 'testing app from a groovy script 3'
}

def deployApp(){
    echo 'deploying app from a groovy script 3'
    echo "deploying version ${params.Version}"
}

return this