pipeline{
	agent any
	stages{
		stage('Build'){
			steps{
				withMaven(maven : 'maven1'){
					bat 'mvn clean'
				}
			}
		}
	}
}				
				
		
