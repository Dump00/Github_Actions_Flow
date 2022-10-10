FROM openjdk:17-jdk-slim-buster
EXPOSE 8080
ADD target/spring-flow.jar spring-flow.jar
ENTRYPOINT ["java", "-jar", "/spring-flow.jar"]