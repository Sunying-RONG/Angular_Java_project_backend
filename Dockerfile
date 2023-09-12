FROM openjdk:8-jdk-alpine
ARG JAR_FILE=target/projetJavaAvance-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT [ "java","-jar","/app.jar","--spring.datasource.url=jdbc:mariadb://localhost:3306/monumentJavaAvance"]