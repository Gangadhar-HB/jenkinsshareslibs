def call (String stageName){
if  ("${stageName}" == "Install")
  {
    sh " npm install --legacy-peer-deps"
  }
else if ("${stageName}" == "Build")
{
  sh " npm run build"
}
}
