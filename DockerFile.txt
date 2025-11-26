#Start with a base image containing Java runtime
FROM eclipse-temurin:17-jdk-jammy

#Information around who maintains the Image
MAINTAINER Rakesh Nair

#Add the application's jar to the image
COPY target/accounts-0.0.1-SNAPSHOT.jar accounts-0.0.1-SNAPSHOT.jar

#execute the application
ENTRYPOINT ["java", "-jar", "accounts-0.0.1-SNAPSHOT.jar"]