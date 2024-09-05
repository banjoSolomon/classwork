FROM maven:3.8.7 as build
COPY classwork .
RUN mvn -B clean package -DskipTests
FROM openjdk:17
COPY --from=build target/*.jar classwork.jar
    #ENV SPRING_PROFILES_ACTIVE=$(PROFILE)
ENTRYPOINT ["java", "-jar", "-Dserver.port=5432", "classwork.jar"]