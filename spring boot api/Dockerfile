FROM openjdk:21

# Set the working directory in the container
WORKDIR /app

# Copy the packaged jar file into the container at /app
COPY target/ecommerce-0.0.1-SNAPSHOT.jar /app/your-application.jar

# Expose the port the application runs on
EXPOSE 8081

# Specify the command to run your application
CMD ["java", "-jar", "/app/your-application.jar"]
