#!/bin/sh

javac -d out -Xlint:none src/org/uob/a1/*.java
java -cp out org.uob.a1.Game 