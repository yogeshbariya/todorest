FROM adoptopenjdk/openjdk11:alpine-jre
ADD target/todorest-0.0.1-SNAPSHOT.jar todorest.jar 
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "todorest.jar"]
