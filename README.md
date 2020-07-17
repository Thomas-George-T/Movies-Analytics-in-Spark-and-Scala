![GitHub](https://img.shields.io/github/license/Thomas-George-T/MoviesLens-Analytics-in-Spark-and-Scala?style=flat)
![GitHub top language](https://img.shields.io/github/languages/top/Thomas-George-T/MoviesLens-Analytics-in-Spark-and-Scala?style=flat)
![GitHub language count](https://img.shields.io/github/languages/count/Thomas-George-T/MoviesLens-Analytics-in-Spark-and-Scala?style=flat)
![GitHub last commit](https://img.shields.io/github/last-commit/Thomas-George-T/MoviesLens-Analytics-in-Spark-and-Scala?style=flat)
![ViewCount](https://views.whatilearened.today/views/github/Thomas-George-T/Movies-Analytics-in-Spark-and-Scala.svg?cache=remove)


<p align="center">
	<a href="#">
		<img src="https://upload.wikimedia.org/wikipedia/commons/f/f3/Apache_Spark_logo.svg" alt="Apache Spark Logo" width=275>
	</a>
	<br>
</p>


# Description
Using Spark to query Analytical questions on the [MovieLens dataset](https://grouplens.org/datasets/movielens/1m/) containing a million records using Spark. This features the use of Spark RDD, Spark SQL and Spark Dataframes executed on Spark-Shell using Scala API. We aim to draw useful insights about users and movies by answering a few basic questions.

## Environment
* Linux (Ubuntu 15.04)
* Hadoop 2.7.2
* Spark 2.0.2
* Scala 2.11

## Installation steps

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

## Analytical Queries

### Spark RDD
- [What are the top 10 most viewed movies?](/Spark_RDD/Top_10_Most_Viewed_Movies/)
- [What are the distinct list of genres available?](/Spark_RDD/Distinct_Genres/)
- [How many movies for each genre?](Spark_RDD/Movies_in_each_genre/)
- [How many movies are starting with numbers or letters (Example: Starting with 1/2/3../A/B/C..Z)?](Spark_RDD/Movies_starting_with_Letters_or_Numbers/)
- [List the latest released movies](Spark_RDD/Latest_movies/)

### Spark SQL
- [Create tables for movies.dat, users.dat and ratings.dat: Saving as Tables from Spark SQL](/Spark_SQL/sparkdatalake/)
- [Find the list of the oldest released movies.](/Spark_SQL/list_of_the_oldest_movies/)
- [How many movies are released each year?](/Spark_SQL/movies_each_year/)
- [How many number of movies are there for each rating?](/Spark_SQL/movies_per_rating/)
- [How many users have rated each movie?](Spark_SQL/num_users_per_movie)
- [What is the total rating for each movie?](Spark_SQL/total_rating_per_movie/) 
- [What is the average rating for each movie?](Spark_SQL/average_rating_per_movie/)

### Spark DataFrames
- [Prepare Movies data: Extracting the Year and Genre from the Text](Spark_DataFrames/prepare_movies_dat)
- [Prepare Users data: Loading a double delimited csv file](Spark_DataFrames/prepare_users_dat)
- [Prepare Ratings data: Programmatically specifying a schema for the dataframe](Spark_DataFrames/prepare_ratings_dat)

> _**Note:** The results were repartitioned and stored into the same text file. It is highly recommended to not do this but it is done here for the sake of readability_

## Article Mentions
This project was featured on [Data Machina Issue #130](https://www.getrevue.co/profile/datamachina/issues/data-machina-issue-130-112552) listed at number 3 under ScalaTOR. Thank you for the listing

## License
This repository is licensed under Apache License 2.0 - see [License](LICENSE.md) for more details

