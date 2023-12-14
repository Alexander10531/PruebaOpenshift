FROM openjdk:17-jdk-alpine as Maven-builder

WORKDIR /app/envioPago

COPY ./.mvn ./.mvn
COPY ./mvnw .
COPY ./pom.xml .

RUN chmod +x mvnw

COPY ./src ./src

VOLUME /m2
RUN ./mvnw org.apache.cxf:cxf-codegen-plugin:3.4.3:wsdl2java package -Dmaven.repo.local=/m2/repository

FROM openjdk:17-jdk-alpine

WORKDIR /app

COPY --from=Maven-builder /app/envioPago/target/./demo-0.0.1-SNAPSHOT.jar .

EXPOSE 8080

ENTRYPOINT ["java","-jar","./demo-0.0.1-SNAPSHOT.jar"]