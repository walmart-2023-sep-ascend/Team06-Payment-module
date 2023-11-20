FROM openjdk:17
EXPOSE 6001
ADD target/payment-service-docker.jar payment-service-docker.jar
ENTRYPOINT ["java","-jar","payment-service-docker.jar"]