#!/usr/bin/env bash
##################################################
# Purpose : To automate the testing of the query
# Author  : Thomas George Thomas
##################################################

if [ -d "result" ]
then 		
	echo ""
	echo "Removing previously existing results"
	echo ""
	rm -r "result"
else
	echo "Executing script"
	echo ""
fi
spark-shell -i average_rating_per_movie.scala
echo ""
echo ""
cat result/part*.csv
echo ""
