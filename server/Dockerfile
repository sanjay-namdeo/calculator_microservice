FROM openjdk:8-jdk-alpine
RUN cd server && mvn clean install
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} server-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/server-0.0.1-SNAPSHOT.jar"]
#