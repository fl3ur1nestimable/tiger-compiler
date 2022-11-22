java -jar ./lib/antlr-4.9.2-complete.jar tiger.g -no-listener -no-visitor -o ./src/parser
javac  -cp ./lib/antlr-4.9.2-complete.jar:./src ./src/Main.java -d ./bin
echo "Running Tests"
for file in $(ls -A tests/$dir)
	do
		if [[ $file =~ \.tiger$ ]]
		then
            echo "Testing $file"
            java -cp ./lib/antlr-4.9.2-complete.jar:./bin Main ./tests/$dir/$file
            #if the test worked, then go to the next one
            if [ $? -eq 0 ]
            then
                echo "Test $file passed"
                continue
            else
                echo "Test $file failed"
                continue
            fi
        fi
    done

echo "Running Mac Tiger tests"
for file in $(ls -A tests/mac/$dir)
    do
        if [[ $file =~ \.tiger$ ]]
        then
            echo "Testing $file"
            java -cp ./lib/antlr-4.9.2-complete.jar:./bin Main ./tests/mac/$dir/$file
            #if the test worked, then go to the next one
            if [ $? -eq 0 ]
            then
                echo "Test $file passed"
                continue
            else
                echo "Test $file failed"
                continue
            fi
        fi
    done
