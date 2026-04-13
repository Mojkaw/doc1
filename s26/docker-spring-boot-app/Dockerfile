# Fetch Java image
FROM eclipse-temurin:25-jdk-alpine
# Expose port 8080
EXPOSE 8080
# Set a docker volume if you want
VOLUME /tmp
# Add the jar file
ADD /target/*.jar docker-spring-boot-app-0.0.1-SNAPSHOT.jar
# Start the application
ENTRYPOINT ["java", "-jar", "/docker-spring-boot-app-0.0.1-SNAPSHOT.jar"]