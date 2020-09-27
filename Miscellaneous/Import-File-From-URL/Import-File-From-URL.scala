
val raw =  scala.io.Source.fromURL("https://raw.githubusercontent.com/Thomas-George-T/Movies-Analytics-in-Spark-and-Scala/master/Movielens/users.dat").mkString

val list = raw.split("\n").filter(_ != "")

val rdd = sc.parallelize(list)

val Data = rdd.toDF

Data.head()



