def call (Map config = [:] ){
  if ("${config}" == "gangadhar"){
     sh "Hello ${config.name}."
  }
  else if("${config}" == "badsha"){
    sh "Hello ${config.name}."
  }
}
