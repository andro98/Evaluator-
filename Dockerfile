FROM openjdk:8
EXPOSE 8089
ADD target/spring-boot-evaluator.jar spring-boot-evaluator.jar
ENTRYPOINT ["java","-jar","/spring-boot-evaluator.jar"]