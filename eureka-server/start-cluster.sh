#!/usr/bin/env bash

gradle clean build -x test
cd build/libs
SPRING_PROFILES_ACTIVE=primary  java -jar eureka-server-0.0.1-SNAPSHOT.jar &
SPRING_PROFILES_ACTIVE=secondary  java -jar eureka-server-0.0.1-SNAPSHOT.jar &
SPRING_PROFILES_ACTIVE=tertiary java -jar eureka-server-0.0.1-SNAPSHOT.jar
#java -jar -Dspring.profiles.active=primary eureka-server-0.0.1-SNAPSHOT.jar &
#java -jar -Dspring.profiles.active=secondary eureka-server-0.0.1-SNAPSHOT.jar &
#java -jar -Dspring.profiles.active=tertiary eureka-server-0.0.1-SNAPSHOT.jar
