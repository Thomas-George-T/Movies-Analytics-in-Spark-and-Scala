#!/bin/usr/env bash
if [ -d "result" ]
then
	echo ""
	echo "Removing existing directory"
	rm -r "result"
else
	echo ""
	echo "Executing script"
	echo ""
fi
spark-shell -i latest_movies.scala
echo ""
echo "The latest released movies are:"
echo ""
cat "result/part-00000"
echo ""
