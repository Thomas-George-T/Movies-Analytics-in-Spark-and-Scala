spark.sql("drop database if exists sparkdatalake cascade")
spark.sql("create database sparkdatalake");
// 2nd method is to read the file directly into a dataFrame
spark.read.textFile("../../Movielens/movies.dat").write.mode("overwrite").saveAsTable("sparkdatalake.movies_ip");
spark.read.textFile("../../Movielens/ratings.dat").write.mode("overwrite").saveAsTable("sparkdatalake.ratings_ip");
spark.read.textFile("../../Movielens/users.dat").write.mode("overwrite").saveAsTable("sparkdatalake.users_ip");
System.exit(0)
