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

  steps {
    // ansible-playbook tomcat-install.yml
  }
}

