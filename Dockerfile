FROM openjdk:17
EXPOSE 9500
ADD target/payment-service.jar payment-service.jar
ENTRYPOINT ["java","-jar","payment-service.jar"]