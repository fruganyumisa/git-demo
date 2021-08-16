#!/usr/bin/env bash
sudo gpasswd -a $USER docker
newgrp docker
docker-compose up -d


