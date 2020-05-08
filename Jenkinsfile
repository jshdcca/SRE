p
peline {
  agent {
    label 'master'
    }

    stages {
      stage('run playbook') {
	steps {
	  dir("${env.WORKSPACE}"){
	    sh 'ansible-playbook -i hosts tomcat-install.yml --user root'
	  }
	}
      }
    }
  }
