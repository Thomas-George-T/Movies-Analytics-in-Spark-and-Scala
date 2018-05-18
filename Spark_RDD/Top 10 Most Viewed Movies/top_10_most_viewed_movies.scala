val ratingsRDD=sc.textFile("../../Movielens/ratings.dat")
val movies=ratingsRDD.map(line=>line.split("::")(1).toInt)
val movies_pair=movies.map(mv=>(mv,1))

val movies_count=movies_pair.reduceByKey((x,y)=>x+y)
val movies_sorted=movies_count.sortBy(x=>x._2,false,1)

val mv_top10List=movies_sorted.take(10).toList
val mv_top10RDD=sc.parallelize(mv_top10List)

val mv_names=sc.textFile("../../Movielens/movies.dat").map(line=>(line.split("::")(0).toInt,line.split("::")(1)))
val join_out=mv_names.join(mv_top10RDD)
join_out.sortBy(x=>x._2._2,false).map(x=> x._1+","+x._2._1+","+x._2._2).repartition(1).saveAsTextFile("Top-10-CSV")
System.exit(0)

