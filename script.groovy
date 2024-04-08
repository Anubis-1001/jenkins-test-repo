def buildApp(){
    echo 'building app from a groovy script'
}

def testApp(){
    echo 'testing app from a groovy script'
}

def deployApp(){
    echo 'deploying app from a groovy script'
    echo "deploying version ${params.Version}"
}

return this