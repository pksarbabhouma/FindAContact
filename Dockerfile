FROM amazoncorretto:8u352-alpine3.16-jre
EXPOSE 8080

WORKDIR /find-a-contact
RUN mkdir ./target
RUN chmod 777 target
RUN cd target
ADD target/FindAContactApp.jar ./app.jar

ENTRYPOINT ["java", "-jar", "./app.jar"]