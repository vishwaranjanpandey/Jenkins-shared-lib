def call () {
   withMaven(globalMavenSettingsConfig: 'Maven-setting', jdk: 'jdk17', maven: 'maven3', mavenSettingsConfig: '', traceability: true) {
   sh "mvn deploy -DskipTests=true"
   }
}
