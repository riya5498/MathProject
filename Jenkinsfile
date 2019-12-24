pipeline{
	agent any
	stages{
		stage('Build'){
			steps{
				def mvnHome = tool name: 'maven1', type: 'maven'
				bat "%{mvnHome}%/bin/mvn clean'
			
			}
		}
	}
}				
				
		
