pipeline {
	agent any
	
	stages {
		stage ('Compile stage'){
			
			steps{
				withMaven(maven: 'maven1'){
					sh 'mvn clean'
				}
			}
		}
		
		stage('Test stage'){
		
			steps{
				withMaven(maven: 'maven1'){
					sh 'mvn test'
				}
			}
		}
		
		stage('Package stage'){
		
			steps{
				withMaven(maven: 'maven1'){
					sh 'mvn install'
				}
			}
		}
	}
}
		
