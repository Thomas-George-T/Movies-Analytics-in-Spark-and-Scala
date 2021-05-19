![GitHub](https://img.shields.io/github/license/Thomas-George-T/MoviesLens-Analytics-in-Spark-and-Scala?style=flat)
![GitHub top language](https://img.shields.io/github/languages/top/Thomas-George-T/MoviesLens-Analytics-in-Spark-and-Scala?style=flat)
![GitHub language count](https://img.shields.io/github/languages/count/Thomas-George-T/MoviesLens-Analytics-in-Spark-and-Scala?style=flat)
![GitHub last commit](https://img.shields.io/github/last-commit/Thomas-George-T/MoviesLens-Analytics-in-Spark-and-Scala?style=flat)
![ViewCount](https://views.whatilearened.today/views/github/Thomas-George-T/Movies-Analytics-in-Spark-and-Scala.svg?cache=remove)

# Overview
Solving analytical questions on the semi-structured [MovieLens dataset](https://grouplens.org/datasets/movielens/1m/) containing a million records using Spark and Scala. This features the use of Spark RDD, Spark SQL and Spark Dataframes executed on Spark-Shell (REPL) using Scala API. We aim to draw useful insights about users and movies by leveraging different forms of Spark APIs.

# Table of Contents
* [Components](https://github.com/Thomas-George-T/Movies-Analytics-in-Spark-and-Scala#Major-Components)
* [Environment](https://github.com/Thomas-George-T/Movies-Analytics-in-Spark-and-Scala#Environment)
* [Installation steps](https://github.com/Thomas-George-T/Movies-Analytics-in-Spark-and-Scala#Installation-steps)
* [Analytical Queries](https://github.com/Thomas-George-T/Movies-Analytics-in-Spark-and-Scala#Analytical-Queries)
	- [Spark RDD](https://github.com/Thomas-George-T/Movies-Analytics-in-Spark-and-Scala#Spark-RDD)
	- [Spark SQL](https://github.com/Thomas-George-T/Movies-Analytics-in-Spark-and-Scala#Spark-SQL)
	- [Spark DataFrames](https://github.com/Thomas-George-T/Movies-Analytics-in-Spark-and-Scala#Spark-DataFrames)
	- [Miscellaneous](https://github.com/Thomas-George-T/Movies-Analytics-in-Spark-and-Scala#Miscellaneous)
* [Mentions](https://github.com/Thomas-George-T/Movies-Analytics-in-Spark-and-Scala#Mentions)
* [License](https://github.com/Thomas-George-T/Movies-Analytics-in-Spark-and-Scala#License)

# Major Components

<p align="center">
	<a href="#">
		<img src="https://upload.wikimedia.org/wikipedia/commons/f/f3/Apache_Spark_logo.svg" alt="Apache Spark Logo" title="Apache Spark" width=275 hspace=80 />
	</a>
	<a href="#">
		<img src="https://raw.githubusercontent.com/Thomas-George-T/Thomas-George-T/master/assets/scala.svg" alt="Scala" title="Scala" width ="90" />
	</a>
</p>

# Environment
* Linux (Ubuntu 15.04)
* Hadoop 2.7.2
* Spark 2.0.2
* Scala 2.11

# Installation steps

1. Simply clone the repository
	```
	git clone https://github.com/Thomas-George-T/Movies-Analytics-in-Spark-and-Scala.git
	```
2. In the repo, Navigate to Spark RDD, Spark SQL or Spark Dataframe locations as needed.

3. Run the execute script to view results
	```
	sh execute.sh
	```
4. The `execute.sh` will pass the scala code through spark-shell and then display the findings in the terminal from the results folder.

# Analytical Queries

## Spark RDD
- [What are the top 10 most viewed movies?](/Spark_RDD/Top_10_Most_Viewed_Movies/)
- [What are the distinct list of genres available?](/Spark_RDD/Distinct_Genres/)
- [How many movies for each genre?](Spark_RDD/Movies_in_each_genre/)
- [How many movies are starting with numbers or letters (Example: Starting with 1/2/3../A/B/C..Z)?](Spark_RDD/Movies_starting_with_Letters_or_Numbers/)
- [List the latest released movies](Spark_RDD/Latest_movies/)

## Spark SQL
- [Create tables for movies.dat, users.dat and ratings.dat](/Spark_SQL/sparkdatalake/): Saving Tables from Spark SQL
- [Find the list of the oldest released movies.](/Spark_SQL/list_of_the_oldest_movies/)
- [How many movies are released each year?](/Spark_SQL/movies_each_year/)
- [How many number of movies are there for each rating?](/Spark_SQL/movies_per_rating/)
- [How many users have rated each movie?](Spark_SQL/num_users_per_movie)
- [What is the total rating for each movie?](Spark_SQL/total_rating_per_movie/) 
- [What is the average rating for each movie?](Spark_SQL/average_rating_per_movie/)

## Spark DataFrames
- [Prepare Movies data: Extracting the Year and Genre from the Text](Spark_DataFrames/prepare_movies_dat)
- [Prepare Users data: Loading a double delimited csv file](Spark_DataFrames/prepare_users_dat)
- [Prepare Ratings data: Programmatically specifying a schema for the dataframe](Spark_DataFrames/prepare_ratings_dat)

## Miscellaneous
- [Import Data from URL: Scala](/Miscellaneous/Import-File-From-URL)
- [Save table without defining DDL in Hive](/Miscellaneous/Save-Table-Without-Explicit-DDL)
- [Broadcast Variable example](/Miscellaneous/Broadcast-variable)
- [Accumulator example](/Miscellaneous/Accumulator-Example)
- [Databricks Community Edition](https://community.cloud.databricks.com/login.html)

_**Note:** The results were collected and repartitioned into the same text file: This is not a recommended practice since performance is highly impacted but it is done here for the sake of readability._

# Mentions
This project was featured on [Data Machina Issue #130](https://www.getrevue.co/profile/datamachina/issues/data-machina-issue-130-112552) listed at number 3 under ScalaTOR. Thank you for the listing

# License
This repository is licensed under Apache License 2.0 - see [License](LICENSE.md) for more details

