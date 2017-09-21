FROM java:8

RUN mkdir /app
WORKDIR /app

ADD build/libs/events-0.0.1-SNAPSHOT.jar /app
RUN ln -s /app/events-0.0.1-SNAPSHOT.jar /app/events-latest.jar

EXPOSE 9999
CMD ["java","-jar","/app/events-latest.jar"]

# CMD java -jar /app/events-latest.jar


