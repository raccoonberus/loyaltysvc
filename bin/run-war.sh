#!/usr/bin/env bash

TOMCAT_HOME=/opt/tomcat
ARTIFACT=loyaltysvc
VERSION=1.0-SNAPSHOT

mvn clean package -P release -DskipTests=true
cp target/${ARTIFACT}-${VERSION}.war ${TOMCAT_HOME}/webapps/
sh ${TOMCAT_HOME}/bin/startup.sh

echo "Open http://localhost:8080/${ARTIFACT}-${VERSION}/"

read -p "Press any key to continue... " -n1 -s
sh ${TOMCAT_HOME}/bin/shutdown.sh
