#!/bin/sh

javac -d out src/org/uob/a2/*.java src/org/uob/a2/commands/*.java src/org/uob/a2/gameobjects/*.java src/org/uob/a2/parser/*.java src/org/uob/a2/utils/*.java 
java -cp out org.uob.a2.Game 