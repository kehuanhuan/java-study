CLASSPATH=out
BIN=bin
JAR_NAME=demo.jar
RESOURCES=resources
MANIFEST=resources/MANIFEST.MF
SRC=src
LIBS=libs

compile:
	find $(SRC) -name "*.java" > $(RESOURCES)/sources.list
	javac -d $(CLASSPATH) -cp $(LIBS)/* -encoding utf-8 @$(RESOURCES)/sources.list

test:
	java -cp "$(CLASSPATH):$(LIBS)/*" com.demo.Main

jar:
	jar -cvfm $(BIN)/$(JAR_NAME) $(MANIFEST) $(LIBS)/* -C $(CLASSPATH) .

run:
	java -jar $(BIN)/$(JAR_NAME)

clean:
	rm -rf $(CLASSPATH) $(BIN)/* $(JAR_NAME) $(RESOURCES)/sources.list
