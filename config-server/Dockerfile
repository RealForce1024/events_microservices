#FROM java:8
FROM java:alpine
RUN mkdir /app
WORKDIR /app

#ADD target/config-server-0.0.1-SNAPSHOT.jar /app
ADD build/libs/config-server-0.0.1-SNAPSHOT.jar /app
RUN ln -sf /app/config-server-0.0.1-SNAPSHOT.jar /app/config-server-latest.jar
EXPOSE 9999
CMD ["java","-jar","/app/config-server-latest.jar"]
