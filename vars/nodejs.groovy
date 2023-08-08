def call (String stageName){
if  ("${stageName}" == "Install")
  {
    sh " npm install"
  }
else if ("${stageName}" == "Build")
{
  sh " npm run build"
}
}
