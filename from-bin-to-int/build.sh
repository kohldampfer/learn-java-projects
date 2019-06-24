#!/bin/sh

set -e

for j in $(ls *.java); do
	javac -Werror $j
done
