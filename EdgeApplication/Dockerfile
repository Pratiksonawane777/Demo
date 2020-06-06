FROM openjdk:8
ADD target/EdgeApplication.jar edge-server.jar
EXPOSE 9090
ENTRYPOINT ["java", "-jar", "edge-server.jar"]