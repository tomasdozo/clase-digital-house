FROM openjdk:17-alpine
WORKDIR /app/
COPY src ./src
COPY pom.xml ./
RUN wget https://dlcdn.apache.org/maven/maven-3/3.9.1/binaries/apache-maven-3.9.1-bin.tar.gz
RUN tar -xvf apache-maven-3.9.1-bin.tar.gz
RUN ./apache-maven-3.9.1/bin/mvn package

FROM eclipse-temurin:17-jre-alpine
WORKDIR /
COPY --from=0 /app/target/eureka-server.jar ./
EXPOSE 8761
CMD ["java","-jar","./eureka-server.jar"]
