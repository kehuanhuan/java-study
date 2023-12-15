CLASSPATH=out
JAR_NAME=demo.jar
MANIFEST=classes/MANIFEST.MF
SRC=src

compile:
	find $(SRC) -name "*.java" > classes/sources.list
	javac -d $(CLASSPATH) -encoding utf-8 @classes/sources.list

test:
	java -cp $(CLASSPATH) com.demo.Main

jar:
	jar -cvfm $(JAR_NAME) $(MANIFEST) -C $(CLASSPATH) .

run:
	java -jar $(JAR_NAME)

clean:
	rm -rf $(CLASSPATH) $(F) $(JAR_NAME) classes/sources.list
