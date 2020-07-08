val movies_rdd=sc.textFile("../../Movielens/movies.dat")
// 1st method, convert existing rdd into DF using toDF function and then make it into a view
val movies_DF=movies_rdd.toDF.createOrReplaceTempView("movies_view")
// To use spark.sql, it should be at least a temporary view or even an table
spark.sql(""" select
split(value,'::')[0] as movieid,
split(value,'::')[1] as moviename,
substring(split(value,'::')[1],length(split(value,'::')[1])-4,4) as year
from movies_view """).createOrReplaceTempView("movies");
// To view the records, use spark.sql("select * from movies").show()
var result=spark.sql("Select * from movies m1 where m1.year=(Select min(m2.year) from movies m2)").repartition(1).rdd.saveAsTextFile("result")
System.exit(0);
