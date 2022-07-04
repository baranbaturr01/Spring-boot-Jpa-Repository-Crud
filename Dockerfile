FROM openjdk:11
ADD /target/baranbatur-0.0.1-SNAPSHOT.jar /spring-boot-app.jar
ENTRYPOINT ["java", "-jar", "/spring-boot-app.jar"]