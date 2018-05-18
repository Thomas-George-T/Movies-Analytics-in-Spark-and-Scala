#!usr/bin/env bash
# Check if the directory already exists
if [ -d "Top-10-CSV" ]
then
	echo "Removing previous existing directory"
	rm -r Top-10-CSV
else
	echo "No previous existing directory found"
fi
spark-shell -i top_10_most_viewed_movies.scala
echo ""
echo ""
echo "Printing The top 10 most viewed movies"
echo ""
cat "Top-10-CSV/part-00000"
echo ""
