#!/usr/bin/env bash
mvn clean package -U -Dmaven.test.skip=true
docker build -t orionhank/bootu-greeting:latest .
docker push orionhank/bootu-greeting:latest