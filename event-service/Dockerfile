FROM java:8
#FROM java:alpine

RUN mkdir /app
WORKDIR /app

ADD wait-for-it.sh /usr/local/bin/wait-for-it
RUN chmod +x /usr/local/bin/wait-for-it

#ADD target/event-service-0.0.1-SNAPSHOT.jar /app
ADD build/libs/event-service-0.0.1-SNAPSHOT.jar /app
RUN ln -sf /app/event-service-0.0.1-SNAPSHOT.jar /app/event-service-latest.jar

#EXPOSE 9000

CMD ["java","-jar","/app/event-service-latest.jar"]
