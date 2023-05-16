FROM amazoncorretto:11
MAINTAINER tunombre_o_alias
COPY target/Portfolio-0.0.1-SNAPSHOT.jar VF-app.jar
ENTRYPOINT ["java","-jar","/VF-app.jar"]