#!/bin/sh

java -Djava.util.logging.config.file=oracle-log.properties -Doracle.jdbc.Trace=true -classpath "lib/ojdbc6_g.jar:build/jar/*" JdbcConnect
