def call (String name){
  if ("${name}" == "gangadhar"){
     sh "Hello ${name}."
  }
  else if("${name}" == "badsha"){
     sh "Hello ${name}."
  }
}
