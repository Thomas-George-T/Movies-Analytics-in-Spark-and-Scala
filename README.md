![GitHub](https://img.shields.io/github/license/Thomas-George-T/MoviesLens-Analytics-in-Spark-and-Scala.svg)
![GitHub top language](https://img.shields.io/github/languages/top/Thomas-George-T/MoviesLens-Analytics-in-Spark-and-Scala.svg?color=Red)
![GitHub language count](https://img.shields.io/github/languages/count/Thomas-George-T/MoviesLens-Analytics-in-Spark-and-Scala.svg)
	
<p align="center">
	<a href="#">
		<img src="https://spark.apache.org/images/spark-logo-trademark.png" alt="Apache Spark Logo" height=100>
	</a>
	<br>
</p>


# Description
Using Spark to query Analytical questions on the [MovieLens dataset](https://grouplens.org/datasets/movielens/1m/) containing a million records using Spark. This features the use of Spark RDD, Spark SQL and Spark Dataframes executed on Spark-Shell using Scala API.

## Environment
* Linux (Ubuntu 15.04)
* Hadoop 2.7.2
* Spark 2.0.2

## Installation steps

1. Simply clone the repository
	```
	git clone https://github.com/Thomas-George-T/MoviesLens-Analytics-in-Spark-and-Scala.git
	cd MoviesLens-Analytics-in-Spark-and-Scala/
	```
2. Move into Spark RDD, Spark SQL or Spark Dataframe locations

3. Run the execute script to view results
	```
	sh execute.sh
	```
## Analytical Queries

### Spark RDD
1. What are the top 10 most viewed movies?
2. What are the distinct list of genres available?
3. How many movies for each genre?
4. How many movies are starting with numbers or letters (Example: Starting with 1/2/3../A/B/C..Z)?
5. List the latest released movies

### Spark SQL
1. Find the list of the oldest released movies.
2. Create tables for movies.dat, users.dat and ratings.dat
3. How many movies are released each year?
4. How many number of movies are there for each rating?
5. For each movie,
   1. How many users rated? 
   2. What is the total rating? 
   3. What is the average rating?

### Spark DataFrames
1. Clean data and convert into Dataframe.

_Note: The results were repartitioned and stored into the same text file. It is highly recommended to not do this but it is done here for the sake of readability_

## Recognition
This project was featured on [Data Machina Issue #130](https://www.getrevue.co/profile/datamachina/issues/data-machina-issue-130-112552) listed at number 3 under ScalaTOR. Thank you for the listing

## License
This repository is licensed under Apache License 2.0 - see [License](LICENSE.md) for more details

