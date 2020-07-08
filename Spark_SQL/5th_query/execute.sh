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
spark-shell -i 5th_query.scala
echo ""
echo ""
cat result/part*.csv
echo ""
