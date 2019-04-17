# Start with a base image containing Java runtime
FROM openjdk:8-jdk-alpine

# Add Maintainer Info
LABEL maintainer="prashantbarahi@gmail.com"

# Add a volume pointing to /tmp
VOLUME /tmp

# Make port 8080 available to the world outside this container
EXPOSE 8888

# The application's jar file
ARG JAR_FILE_CONFIG=target/spring-cloud-config-server-0.0.1-SNAPSHOT.jar

# Add the application's jar to the container
ADD ${JAR_FILE_CONFIG} spring-cloud-config-server-0.0.1-SNAPSHOT.jar

# Run the jar file
ENTRYPOINT java -jar spring-cloud-config-server-0.0.1-SNAPSHOT.jar
