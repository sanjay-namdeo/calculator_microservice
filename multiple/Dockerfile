FROM openjdk:8-jdk-alpine
RUN cd multiple && mvn clean install
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} multiple-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/multiple-0.0.1-SNAPSHOT.jar"]