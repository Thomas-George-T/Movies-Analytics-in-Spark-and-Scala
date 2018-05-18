<p align="center">
	<img src="https://spark.apache.org/images/spark-logo-trademark.png" alt="Spark Logo" height=100>
</p>

# Description
Using Spark to answer Analytical questions on the [MovieLens dataset](https://grouplens.org/datasets/movielens/1m/) using RDD, Spark SQL and Spark Dataframes executed on Spark-Shell using Scala API.

## Environment
* Linux (Ubuntu 15.04)
* Hadoop 2.7.2
* Spark 2.0.2

## Analytical Queries

### Spark RDD
1. What are the top 10 most viewed movies?
2. What are the distinct list of genres available?
3. How many movies for each genre?
4. How many movies are starting with numbers or letters (Example: Starting with 1/2/3../A/B/C..Z)?
5. List the latest released movies

### Spark DataFrames
#### Using Spark SQL
1. Find the list of the oldest released movies.
2. Create datalake for the tables in movielens.
3. How many movies are released each year?

_Note: The results were repartitioned and stored into the same text file. It is highly recommended to not do this but it is done here for the sake of readability_

## Progress of Project
- [x] Download MovieLens dataset
- [x] Start doing Queries in Spark RDD
- [x] Write bash scripts to automate testing results
- [ ] Do More Queries
- [ ] Queries to be completed in
	- [x] Spark RDD
	- [ ] Spark SQL
	- [ ] Spark DataFrames
