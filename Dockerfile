FROM openjdk:alpine
EXPOSE 8080
ARG JAR_FILE=target/check-1.0.jar
ADD ${JAR_FILE} focus.jar
ENTRYPOINT ["java","-jar","/focus.jar"]
