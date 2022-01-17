FROM openjdk:11.0.7-jre

ENTRYPOINT ["java", "-jar", "/opt/AngoliaApi/AngoliaApi.jar", "--spring.config.location=classpath:/application.properties,file:/opt/AngoliaApi/config/application.properties"]

ARG JAR_FILE
ADD target/${JAR_FILE} /opt/AngoliaApi/AngoliaApi-app.jar

RUN mkdir -p /opt/AngoliaApi/logs/
