@echo off
REM The command below create a basic java web project using maven
mvn archetype:generate -DarchetypeArtifactId=maven-archetype-webapp -DgroupId=com.jrodolfo.jsf -DartifactId=helloWorld -Dversion=1.0-SNAPSHOT  -DinteractiveMode=false
