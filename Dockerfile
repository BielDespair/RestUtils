FROM openjdk:21

WORKDIR /app

COPY target/RestUtils-0.0.1-SNAPSHOT.jar app.jar
COPY src/main/resources/keystore.jks /app/resources/keystore.jks


EXPOSE 8443
ENTRYPOINT ["java", "-jar", "app.jar", "--spring.profiles.active=prod"]
