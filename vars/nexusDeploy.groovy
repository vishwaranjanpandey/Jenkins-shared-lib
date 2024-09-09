def call () {
   withMaven(globalMavenSettingsConfig: '561d4998-105b-4bf9-89b2-14fed2889b59', jdk: 'jdk17', maven: 'maven3', mavenSettingsConfig: '', traceability: true) {
   sh "mvn deploy -DskipTests=true"
   }
}
