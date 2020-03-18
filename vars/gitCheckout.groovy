def call(Map stageParams, String name = 'softtekian') {
    checkout([
        $class: 'GitSCM', 
        branches: [[name: '*/master']], 
        doGenerateSubmoduleConfigurations: false, 
        extensions: [], 
        submoduleCfg: [], 
        userRemoteConfigs: [[url: 'https://github.com/morgom94/Jenkins-labs.git']]
    ])
    echo "Hello, ${name}."
}
