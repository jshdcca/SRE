# Tomcat Server Installation

  - Type some Markdown on the left
  - See HTML in the right
  - Magic

# Tools used

  - Jenkins Pipeline (to iniate the job and for githooks)
  - Ansible (to run the task(install tomcat)


Notes:
  - You can run the ansible playbook as a standalone task
```ansible-playbook -i hosts tomcat-install.yml --user root```
  - **OR** make a pull request or commit to this master branch to trigger the job on Jenkins. Jenkins will read the ```Jenkinsfile``` for the configuration.
  - The playbook no longer require hosts on the inventory list any pre configuration

To-do's:
- convert to Jenkins Pipeline DSL
- make install script flexible enough to do multiple installations.
maybe pass some variables like <installation/path+$IT>

# Some screenshots:
[![N|Solid](https://i.imgur.com/hJmIRvE.png)]
[![N|Solid](https://i.imgur.com/2eIDVBN.png)]
[![N|Solid](https://i.imgur.com/sPCviTr.png)]
