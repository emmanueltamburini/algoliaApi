#!/bin/sh

#Install node
wget https://nodejs.org/dist/v14.17.6/node-v14.17.6-linux-x64.tar.xz
mkdir /usr/local/lib/nodejs
tar -xJvf node-v14.17.6-linux-x64.tar.xz -C /usr/local/lib/nodejs
ln -s /usr/local/lib/nodejs/node-v14.17.6-linux-x64/bin/node /usr/bin/node
