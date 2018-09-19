#!/usr/bin/env bash
if [ -d "result" ]
then
	echo "Removing existing directory"
	rm -r "result"
	echo ""
else
	echo "Executing script"
	echo ""
fi
spark-shell -i list_of_oldest_movies.scala
echo ""
echo ""
echo "The list of the oldest movies are"
cat "result/part-00000"
echo ""
