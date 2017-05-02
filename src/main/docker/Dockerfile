FROM gcr.io/google_appengine/openjdk
VOLUME /tmp
ADD boot-1.0.jar app.jar
CMD [ "java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]