FROM maven:v1
WORKDIR /Workspace
COPY . /Workspace
RUN mvn clean compile package
EXPOSE 8082

CMD ["java","-jar","target/spring-boot-0.0.1-SNAPSHOT.jar","--server.port=8082"]