val movies_rdd=sc.textFile("../../Movielens/movies.dat")
val movie_nm=movies_rdd.map(lines=>lines.split("::")(1))
val year=movie_nm.map(lines=>lines.substring(lines.lastIndexOf("(")+1,lines.lastIndexOf(")")))
val latest=year.max
val latest_movies=movie_nm.filter(lines=>lines.contains("("+latest+")")).saveAsTextFile("result")
System.exit(0)
