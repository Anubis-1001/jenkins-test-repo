def buildApp(){
    echo 'building app from a groovy script 4'
}

def testApp(){
    echo 'testing app from a groovy script 4'
}

def deployApp(){
    echo 'deploying app from a groovy script 4'
    echo "deploying version ${params.Version}"
}

return this