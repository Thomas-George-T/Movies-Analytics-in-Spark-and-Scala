//Import Data
val raw =  scala.io.Source.fromURL("https://raw.githubusercontent.com/Thomas-George-T/Movies-Analytics-in-Spark-and-Scala/master/Movielens/users.dat").mkString

val list = raw.split("\n").filter(_ != "")

val rdd = sc.parallelize(list)

val Data = rdd.toDF

// Define Data

Data.createOrReplaceTempView("users_staging");

val viewDF =
spark.sql(""" Select
split(value,'::')[0] as userid,
split(value,'::')[1] as gender,
split(value,'::')[2] as age,
split(value,'::')[3] as occupation,
split(value,'::')[4] as zipcode
from users_staging """)

viewDF.createOrReplaceTempView("users")
spark.sql("Create table if not exists as select * from users")

spark.sql("select * from users").show()
