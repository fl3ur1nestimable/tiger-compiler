java -jar ./lib/antlr-4.9.2-complete.jar tiger.g -no-listener -no-visitor -o ./src/parser
javac  -cp ./lib/antlr-4.9.2-complete.jar:./src ./src/Main.java -d ./bin
java -cp ./lib/antlr-4.9.2-complete.jar:./bin Main ./tests/while_do.tiger

# louis: 12,13,16
# marine : 6,7,14,17