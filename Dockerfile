FROM openjdk:17-oracle

WORKDIR /home/petclinic/

COPY ./build/libs/spring-petclinic-3.2.0.jar app.jar

EXPOSE 8080

ENV MYSQL_URL=jdbc:mysql://petclinic-mysql:3306/petclinic

CMD ["java", "-jar", "app.jar"]
