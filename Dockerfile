FROM openjdk:11

WORKDIR /usr/app

COPY target/interview-0.0.1-SNAPSHOT.jar .

EXPOSE 9090

CMD ["java", "-jar", "interview-0.0.1-SNAPSHOT.jar"]