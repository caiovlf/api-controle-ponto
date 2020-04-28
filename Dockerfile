# For Java 8, try this
FROM adoptopenjdk/openjdk11:alpine-jre

# Refer to Maven build -> finalName
ARG JAR_FILE=target/controle-de-ponto-0.0.1.jar

# cd /opt/app
WORKDIR /opt/app

# cp target/spring-boot-web.jar /opt/app/app.jar
COPY ${JAR_FILE} controle-de-ponto.jar

# java -jar /opt/app/controle-de-ponto.jar
ENTRYPOINT ["java","-jar","controle-de-ponto.jar"]
