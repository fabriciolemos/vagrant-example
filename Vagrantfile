Vagrant.configure("2") do |config|
  config.vm.box = "ubuntu/trusty64"

  config.vm.provision "shell", path: "provision/git.sh"
  config.vm.provision "shell", path: "provision/nodejs.sh"

end
