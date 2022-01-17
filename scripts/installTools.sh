#!/bin/sh

#Install doctl
wget https://github.com/digitalocean/doctl/releases/download/v1.45.1/doctl-1.45.1-linux-amd64.tar.gz
tar xf doctl-1.45.1-linux-amd64.tar.gz
chmod +x ./doctl
mv ./doctl /usr/local/bin/doctl
doctl auth init
doctl kubernetes cluster kubeconfig save ${CLUSTER_NAME}
#Install kubctl
curl -LO https://storage.googleapis.com/kubernetes-release/release/`curl -s https://storage.googleapis.com/kubernetes-release/release/stable.txt`/bin/linux/amd64/kubectl
chmod +x ./kubectl
mv ./kubectl /usr/local/bin/kubectl