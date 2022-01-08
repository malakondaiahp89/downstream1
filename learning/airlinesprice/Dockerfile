FROM openjdk:8-jdk-alpine
RUN apt-get update && apt-get install bash
RUN mkdir -p /usr/app/
ENV PROJECT_HOME /usr/app/
COPY build/libs/airlinesprice-0.0.1-SNAPSHOT.jar $PROJECT_HOME/airlinesprice-0.0.1-SNAPSHOT.jar
WORKDIR $PROJECT_HOME
CMD ["java", "-jar", "./airlinesprice-0.0.1-SNAPSHOT.jar"]