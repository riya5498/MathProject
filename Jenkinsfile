node {
	stage ('SCM checkout'){
		git 'https://github.com/riya5498/MathProject.git'
	}	
	stage ('Build'){
		def mvnHome = tool name: 'maven1', type: 'maven'
		sh "$(mvnHome)/bin/mvn clean"
	}
	stage ('Test'){
		def mvnHome = tool name: 'maven1', type: 'maven'
		sh "$(mvnHome)/bin/mvn test"	
		
}
		
