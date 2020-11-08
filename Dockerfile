FROM openjdk:8u232-jdk-slim-buster
RUN cp /usr/share/zoneinfo/America/Sao_Paulo /etc/localtime
RUN echo "America/Sao_Paulo" > /etc/timezone
VOLUME /tmp
EXPOSE 8761
COPY target/AgendaSUS-Discovery-1.0.0.jar app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]