java -jar ./lib/antlr-4.9.2-complete.jar tiger.g -no-listener -no-visitor -o ./src/parser
javac  -cp ./lib/antlr-4.9.2-complete.jar:./src ./src/Main.java -d ./bin
echo "Running Tests"
for file in $(ls -A tests/base_pass/$dir)
	do
		if [[ $file =~ \.tiger$ ]]
		then
            echo "Testing $file"
            timeout 1s java -cp ./lib/antlr-4.9.2-complete.jar:./bin Main ./tests/base_pass/$dir/$file
        fi
    done

echo "Running Mac Tiger tests"
for file in $(ls -A tests/mac/$dir)
    do
        if [[ $file =~ \.tiger$ ]]
        then
            echo "Testing $file"
            timeout 1s java -cp ./lib/antlr-4.9.2-complete.jar:./bin Main ./tests/mac/$dir/$file
        fi
    done

echo "Running Algo Tests"
for file in $(ls -A tests/algos/$dir)
    do
        if [[ $file =~ \.tiger$ ]]
            then
                echo "Testing $file"
                timeout 1s java -cp ./lib/antlr-4.9.2-complete.jar:./bin Main ./tests/algos/$dir/$file
            fi
    done
