#!/bin/bash
mvn generate-sources
#cp ./target/generated-sources/antlr4/* ./src/main/java/ru/ifmo/ctddev/isaev/gen
#javac -cp ".;./lib/antlr4-4.0.jar" -d ./out ./target/generated-sources/antlr4/G*.java