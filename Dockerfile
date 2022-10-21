FROM openjdk:11

ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar

ENV PORT 9101
EXPOSE $PORT
ENTRYPOINT ["java","-jar", "-Xmx256M", "app.jar"]
