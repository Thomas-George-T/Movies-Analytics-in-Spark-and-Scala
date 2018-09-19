spark.sql("Select distinct(year),count(year) as Number_of_Movies from sparkdatalake.movies group by year").repartition(1).write.format("csv").option("header","true").save("result")
System.exit(0)
