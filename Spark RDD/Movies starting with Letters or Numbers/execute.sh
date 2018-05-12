#!/bin/usr/env bash
if [ -d "result-csv" ]
then
	echo ""
	echo "Removing previous exisitng directory"
	rm -r "result-csv"
	echo ""
else
	echo ""
	echo "Executing script"
	echo ""
fi
spark-shell -i Movies_starting_with_letter_or_digit.scala
echo ""
echo "The Number of Movies starting with letters or digit"
echo ""
echo "Digit/letter,Count"
echo ""
cat "result-csv/part-00000"
echo ""
