Vagrant.configure("2") do |config|
  config.vm.box = "ubuntu/trusty64"

  config.berkshelf.enabled = true

  config.vm.provision "chef_solo" do |chef|
      chef.add_recipe "git"
  end

end
