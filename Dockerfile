FROM openjdk:8-jdk-alpine
LABEL maintainer="Prasad"
VOLUME /tmp
ARG JAR_FILE=target/YellCRM-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} uj2.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/uj2.jar"]
