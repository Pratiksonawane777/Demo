FROM openjdk:8
ADD target/EurekaServer.jar eureka-server.jar
EXPOSE 9090
ENTRYPOINT ["java", "-jar", "eureka-server.jar"]