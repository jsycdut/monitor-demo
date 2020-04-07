#! /usr/bin/env bash

mvn exec:java -Dexec.mainClass="com.piper.code.$1" -Dexec.classpathScope="$2"
