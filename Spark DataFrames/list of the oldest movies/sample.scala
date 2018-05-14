val movies_rdd=sc.textFile("../../Movielens/movies.dat")
val movies_nm=movies_rdd.map(lines=>lines.split("::")(1))
