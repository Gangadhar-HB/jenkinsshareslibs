def call (Map config = [:] ){
  if ("${config}" == "gangadhar"){
     sh "Hello ${config}."
  }
  else if("${config}" == "badsha"){
    sh "Hello ${config}."
  }
}
