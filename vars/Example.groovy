def call(String name = 'Erick Morales', String job = 'Softtek'){
  Example([
      branches: [[name: '*/master']], 
      userRemoteConfigs: [[url: 'https://github.com/morgom94/Jenkins-labs.git']]
  ])
  echo "Hello, my names is ${name} and I work in ${job}"
}
