FROM openjdk:8-jdk-alpine
ADD target/BookStore-0.0.1-SNAPSHOT.jar store.jar
RUN sh -c 'touch /store.jar'
ENTRYPOINT ["java","-jar","app.jar"]
