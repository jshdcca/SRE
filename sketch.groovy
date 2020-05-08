job('tomcat-installation-exam') {
  description("Simple jenkins job to install tomcat packages using Jenkins DSL Pipeline + Ansible")
  label('master')
  
  scm {
    git {
      remote {
	github('jshdcca/SRE', 'https')
      }
      branch('master')
    }
  }
  stages {
    stage('run playbook') {
      steps {
	withEnv(["PATH+ANSIBLE"=${tool 'ansible-scm'}])
	sh 'ansible --version'

	ansiblePlaybook(
	  playbook: '${WORKSPACE}/tomcat-install.yml',
      }
    }
  }
}
