def call (Map config = [:] ){
  if ("${config}" == "gangadhar"){
     sh "Hello ${name}."
  }
  else if("${config}" == "badsha"){
     sh "Hello ${name}."
  }
}
