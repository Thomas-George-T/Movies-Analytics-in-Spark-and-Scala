// 2nd method is to read the file directly into a dataFrame and create a temp view
spark.read.textFile("../../Movielens/movies.dat").createOrReplaceTempView("movies_staging");
spark.read.textFile("../../Movielens/ratings.dat").createOrReplaceTempView("ratings_staging");
spark.read.textFile("../../Movielens/users.dat").createOrReplaceTempView("users_staging");
// Create a database to store the tables
spark.sql("drop database if exists sparkdatalake cascade")
spark.sql("create database sparkdatalake");
// Make appropriate schemas for them
// movies
spark.sql(""" Select 
split(value,'::')[0] as movieid,
split(value,'::')[1] as title,
substring(split(value,'::')[1],length(split(value,'::')[1])-4,4) as year,
split(value,'::')[2] as genre 
from movies_staging """).write.mode("overwrite").saveAsTable("sparkdatalake.movies");
// users
spark.sql(""" Select
split(value,'::')[0] as userid,
split(value,'::')[1] as gender,
split(value,'::')[2] as age,
split(value,'::')[3] as occupation,
split(value,'::')[4] as zipcode
from users_staging """).write.mode("overwrite").saveAsTable("sparkdatalake.users");
// ratings
spark.sql(""" Select
split(value,'::')[0] as userid,
split(value,'::')[1] as movieid,
split(value,'::')[2] as rating,
split(value,'::')[3] as timestamp
from ratings_staging """).write.mode("overwrite").saveAsTable("sparkdatalake.ratings");
System.exit(0) 
