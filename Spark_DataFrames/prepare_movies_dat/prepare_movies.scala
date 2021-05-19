// Clean data into DataFrame
val movies=spark.read.textFile("../../Movielens/movies.dat")
val m_id=movies.map(lines=>lines.split("::")(0)).toDF("MovieID")

//Extract the title
val title=movies.map(lines=>lines.split("::")(1))
val m_title=title.map(x=>x.split("\\(")(0)).toDF("Title")

//Extract the year
val year=movies.map(lines=>lines.substring(lines.lastIndexOf("(")+1,lines.lastIndexOf(")"))).toDF("Year")
val m_genre=movies.map(lines=>lines.split("::")(2)).toDF("Genres")

// For appending the dataframes, we need to import monotonically_increasing_id
import org.apache.spark.sql.functions.monotonically_increasing_id
val m_res1=m_id.withColumn("id", monotonically_increasing_id()).join(m_title.withColumn("id", monotonically_increasing_id()), Seq("id")).drop("id")

val m_res2=m_res1.withColumn("id", monotonically_increasing_id()).join(year.withColumn("id",monotonically_increasing_id()), Seq("id")).drop("id")

val m_result=m_res2.withColumn("id", monotonically_increasing_id()).join(m_genre.withColumn("id", monotonically_increasing_id()), Seq("id")).drop("id")
 

// This will give us the valid data with schema
m_result.show()
// Examples
m_result.where("MovieID=1").show()
m_result.filter("Genres == 'Action'").show()
m_result.select("Title").show()
System.exit(0)
