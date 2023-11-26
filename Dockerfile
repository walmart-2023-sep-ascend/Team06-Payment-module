FROM openjdk:17
EXPOSE 6001
ADD target/payment-service.jar payment-service.jar
ENTRYPOINT ["java","-jar","payment-service.jar"]