FROM --platform=linux/arm64/v8 openjdk:21

EXPOSE 8080

#ADD backend/target/app.jar app.jar


# java  - jar currywurs.jar
ENTRYPOINT ["java", "-jar", "app.jar"]

#Alternative zu Entrypoint
# CMD ["sh", "-c", "java -jar /currywurst.jar"