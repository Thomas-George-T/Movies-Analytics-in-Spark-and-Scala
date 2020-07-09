val ratingsRDD=spark.sparkContext.textFile("ratings.dat")

import org.apache.spark.sql.Row;
import org.apache.spark.sql.types.{StructType, StructField, StringType};

val schemaString = "UserID MovieID Rating Timestamp"

val schema = StructType(schemaString.split(" ").map(fieldName ⇒ StructField(fieldName, StringType, true)))

val rowRDD = ratingsRDD.map(_.split("::")).map(x ⇒ Row(x(0).toInt, x(1).toInt, x(2).toInt, x(3))

val ratings = spark.createDataFrame(rowRDD, schema)