#!/usr/bin/env bash
# Check if the directory is present or not
if [ -d "result" ]
then
	echo "Removing existing directory"
	rm -r result
else
	echo "Executing File"
fi
spark-shell -i list_of_distinct_genres.scala
echo ""
echo ""
echo "The list of distinct genres are"
echo ""
cat "result/part-00000"
echo ""
