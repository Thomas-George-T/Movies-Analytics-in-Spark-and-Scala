// 2nd method is to read the file directly into a dataFrame and create a temp view
spark.read.textFile("../../Movielens/movies.dat").createOrReplaceTempView("movies_staging");
spark.read.textFile("../../Movielens/ratings.dat").createOrReplaceTempView("ratings_staging");
spark.read.textFile("../../Movielens/users.dat").createOrReplaceTempView("users_staging");
// Make appropriate schemas for them
spark.sql("drop database if exists cascade sparkdatalake")
spark.sql("create database sparkdatalake");

spark.read.textFile("../../Movielens/movies.dat").write.mode("overwrite").saveAsTable("sparkdatalake.movies_staging");
spark.read.textFile("../../Movielens/ratings.dat").write.mode("overwrite").saveAsTable("sparkdatalake.ratings_staging");
spark.read.textFile("../../Movielens/users.dat").write.mode("overwrite").saveAsTable("sparkdatalake.users_staging");

System.exit(0)
