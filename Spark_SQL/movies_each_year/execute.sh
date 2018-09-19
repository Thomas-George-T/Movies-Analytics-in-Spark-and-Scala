#!/usr/bin/env bash
if [ -d "result" ]
then 	
	echo "Removing previous results"
	echo ""
	rm -r "result"
else
	echo "Executing script"
	echo ""
fi
spark-shell -i no_of_movies_each_year.scala
echo ""
echo "The Number of movies for each year"
echo ""
cat result/part*.csv
echo ""
