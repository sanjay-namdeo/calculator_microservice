FROM openjdk:8-jdk-alpine
RUN mvn clean install
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} division-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/division-0.0.1-SNAPSHOT.jar"]