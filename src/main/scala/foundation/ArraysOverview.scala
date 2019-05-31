package foundation

object ArraysOverview extends App{

  val counts = Array("900,google.com",
    "60,mail.yahoo.com",
    "10,mobile.sports.yahoo.com",
    "40,sports.yahoo.com",
    "10,stackoverflow.com",
    "2,en.wikipedia.org",
    "1,es.wikipedia.org",
    "1,mobile.sports")




  val countsMap: Array[(String, String)] = counts.map(_.split(",")).map {
    case Array(c, d) => (c, d)
  }

  val comCounts = countsMap.map {
    case (x, y) if y.endsWith(".com") => x.toInt
    case _ => 0
  }.reduceLeft(_ + _)

  //prints 1020 the count for domains that ends with .com


//def domainCounts(array: Array[String]): List[(Int, String)] = ???









}
