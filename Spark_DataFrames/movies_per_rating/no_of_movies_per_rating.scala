spark.sql("use sparkdatalake")
spark.sql("""Select rating as Ratings,count(rating) as Number_of_Movies_per_rating
from sparkdatalake.ratings 
group by rating
order by rating asc""").show
