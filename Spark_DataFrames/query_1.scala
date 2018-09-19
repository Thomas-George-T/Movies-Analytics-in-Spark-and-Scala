val movies_df=spark.read.textFile("movies.dat").map(lines=>lines.split("::").mkString("\t"))
val res1=spark.read.textFile(movies_df).option("delimiter","\t")
System.exit(0);




var df = spark.sqlContext.read.option("header", "true").option("inferSchema", "true").option("delimiter", "\t").csv(spark.sqlContext.read.textFile("movies.dat").map(line => line.split("::").mkString("\t")))
