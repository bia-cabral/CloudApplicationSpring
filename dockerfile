#
# Dockerfile
#
FROM maven:3.8.3-openjdk-17 AS build
COPY . .
RUN mvn clean package -DskipTests

#
# Package stage
#
FROM openjdk:17-jdk-slim
COPY --from=build /target/CloudApplicationSpring-0.0.1.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","app.jar"]