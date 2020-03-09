FROM openjdk:8-jdk-alpine
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} sum-0.0.1-SNAPSHOT.jar.jar
ENTRYPOINT ["java","-jar","/sum-0.0.1-SNAPSHOT.jar"]