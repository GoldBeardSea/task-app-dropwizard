FROM openjdk:8u121-jre-alpine

WORKDIR /var/task-app

ADD target/task-app-1.0-SNAPSHOT.jar /var/task-app/task-app.jar
ADD config-docker.yml /var/task-app/config.yml

EXPOSE 8080 8080

ENTRYPOINT ["java", "-jar", "task-app.jar", "server", "config.yml"]