Vagrant.configure("2") do |config|
  config.vm.box = "ubuntu/trusty64"
  config.vm.network "forwarded_port", guest: 3000, host: 3000
  config.vm.network "forwarded_port", guest: 3001, host: 3001

  config.vm.provider "virtualbox" do |v|
    v.memory = 1024
  end

  config.vm.provision "shell", path: "provision/git.sh"
  config.vm.provision "shell", path: "provision/nodejs.sh"
  config.vm.provision "shell", path: "provision/npm_packages.sh"
  config.vm.provision "shell", path: "provision/java.sh"
  config.vm.provision "shell", path: "provision/maven.sh"

end
