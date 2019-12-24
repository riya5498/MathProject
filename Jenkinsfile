pipeline {
   agent any

   tools {
      // Install the Maven version configured as "M3" and add it to the path.
      maven "maven1"
   }

   stages {
      stage('Build') {
         steps {
            // Get some code from a GitHub repository
            git 'https://github.com/riya5498/MathProject.git'

            // To run Maven on a Windows agent, use
             bat "mvn -Dmaven.test.failure.ignore=true clean"
         }
	stage('Test') {
         steps {
            // Get some code from a GitHub repository
            git 'https://github.com/riya5498/MathProject.git'

            // To run Maven on a Windows agent, use
             bat "mvn -Dmaven.test.failure.ignore=true test"
         }
	stage('Code quality check') {
         steps {
            // Get some code from a GitHub repository
            git 'https://github.com/riya5498/MathProject.git'

            // To run Maven on a Windows agent, use
             bat "mvn -Dmaven.test.failure.ignore=true sonar:sonar"
         }

         post {
            // If Maven was able to run the tests, even if some of the test
            // failed, record the test results and archive the jar file.
            success {
               junit '**/target/surefire-reports/TEST-*.xml'
               archiveArtifacts 'target/*.jar'
            }
         }
      }
   }
}
}
