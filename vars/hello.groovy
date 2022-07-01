def call (String name){
  if ("${name}" == "gangadhar"){
     sh "Hello ${name}."
  }
  elif("${name}" == "badsha"){
     sh "Hello ${name}."
  }
}
