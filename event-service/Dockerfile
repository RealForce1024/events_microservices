#FROM java:8
FROM java:alpine
RUN mkdir /app
WORKDIR /app

ADD target/event-service-0.0.1-SNAPSHOT.jar /app
#ADD build/libs/event-service-0.0.1-SNAPSHOT.jar /app
RUN ln -s /app/event-service-0.0.1-SNAPSHOT.jar /app/event-service-latest.jar
EXPOSE 9999
CMD ["java","-jar","/app/event-service-latest.jar"]
