filename = RunMatrix

all: build run

build:
	javac $(filename).java

run:
	java $(filename)

clean:
	rm $(filename).class
