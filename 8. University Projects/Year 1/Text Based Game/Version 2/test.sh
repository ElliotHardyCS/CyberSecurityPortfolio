#!/bin/sh

javac -d out -Xlint:none  -cp .:lib/junit-jupiter-api-5.11.1.jar:lib/hamcrest-core-3.0.jar src/org/uob/a2/*.java src/org/uob/a2/commands/*.java src/org/uob/a2/gameobjects/*.java src/org/uob/a2/parser/*.java src/org/uob/a2/utils/*.java  test/org/uob/a2/parser/*.java test/org/uob/a2/commands/*.java test/org/uob/a2/gameobjects/*.java test/org/uob/a2/utils/*.java
java -jar lib/junit-platform-console-standalone-1.9.0.jar --details=none --class-path ./out/ --scan-classpath