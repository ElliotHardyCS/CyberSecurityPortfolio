#!/bin/sh

javac -d out -Xlint:none  -cp .:lib/junit-jupiter-api-5.11.1.jar:lib/hamcrest-core-3.0.jar src/org/uob/a1/*.java test/org/uob/a1/*.java 
java -jar lib/junit-platform-console-standalone-1.9.0.jar --details=none --class-path ./out/ --scan-classpath