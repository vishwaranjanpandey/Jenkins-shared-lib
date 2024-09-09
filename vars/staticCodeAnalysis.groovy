def call () {
  withSonarQubeEnv('sonar'){
  sh ''' $SCANNER_HOME/bin/sonar-scanner -Dsonar.projectName=shoppingcart \
  -Dsonar.java.binaries=. \
  -Dsonar.projectKey=shoppingcart '''
  }
}
