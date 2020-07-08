val usersRDD=spark.sparkContext.textFile("users.dat")

import org.apache.spark.sql.Row;
import org.apache.spark.sql.types.{StructType, StructField, StringType};

val schemaString = "UserID Gender Age Occupation Zip-code"

val schema = StructType(schemaString.split(" ").map(fieldName ⇒ StructField(fieldName, StringType, true)))

val rowRDD = usersRDD.map(_.split("::")).map(x ⇒ Row(x(0), x(1), x(2), x(3), x(4)))

val users_1 = spark.createDataFrame(rowRDD, schema)