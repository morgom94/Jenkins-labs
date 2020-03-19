def call(Map stageParams, String name = 'softtekian', Integer age= 25) {
    checkout([
        $class: 'GitSCM', 
        branches: [[name: '*/master']], 
        doGenerateSubmoduleConfigurations: false, 
        extensions: [], 
        submoduleCfg: [], 
        userRemoteConfigs: [[url: 'https://github.com/morgom94/Jenkins-labs.git']]
    ])
    build job: 
        'Pipe', 
        parameters: [booleanParam(name: 'userFlag', value: true), 
                     string(name: 'CHOICE', value: 'US-EAST-1'), 
                     text(name: 'TEXT', value: '''Hello there'''), 
                     string(name: 'STRING', value: 'Library example')
                    ]
    
    echo "Hello, ${name} "
    echo "and I'm ${age} years old."
}
