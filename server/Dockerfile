FROM openjdk:17-jdk-slim AS build
WORKDIR /server
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} ./server.jar
RUN java -Djarmode=layertools -jar server.jar extract

FROM openjdk:17-jdk-slim
WORKDIR /server
COPY --from=build /server/dependencies/ ./
COPY --from=build /server/spring-boot-loader/ ./
COPY --from=build /server/snapshot-dependencies/ ./
COPY --from=build /server/application/ ./
ENTRYPOINT ["java", "org.springframework.boot.loader.JarLauncher"]
