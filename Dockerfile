FROM openjdk:8-jre-slim
RUN useradd -s /bin/bash user
USER user
COPY --chown=644 target/agent-api-*.jar /agent-api.jar
EXPOSE 8080
ENTRYPOINT ["java","-XX:+UnlockExperimentalVMOptions","-XX:+UseCGroupMemoryLimitForHeap","-jar","/agent-api.jar"]
