#!/bin/sh

#java -Djava.util.logging.config.file=conf/logger.properties \
#    -Doracle.jdbc.Trace=true \
#    -classpath "lib/ojdbc6_g.jar:build/classes" JdbcConnect

java -Djava.util.logging.config.file=conf/logger.properties \
    -Doracle.jdbc.Trace=true \
    -cp "lib/*:build/classes" JdbcConnect
