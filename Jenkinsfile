pipeline {
  agent {
    label 'master'
    }

    stages {
      stage('run playbook') {
	steps {
	  withEnv(["PATH+ANSIBLE"=${tool 'ansible-scm'}])
	  sh 'ansible --version'
	
	  ansiblePlaybook(
	    playbook: ${WORKSPACE}/tomcat-install.yml',
	    inventory: 'hosts'
	    )
	}
      }
    }
  }
