web: java -Dserver.port=$PORT $JAVA_OPTS -jar process/target/process-1.0-SNAPSHOT.jar --spring.config.name=heroku
worker: java -Dserver.port=$PORT $JAVA_OPTS -jar module/target/module-1.0-SNAPSHOT.jar --spring.config.name=heroku

# web: java -Dserver.port=$PORT $JAVA_OPTS -jar $JAR_FILE --spring.config.name=heroku