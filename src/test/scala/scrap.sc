

val span = List(2, 8, 1, 2).span(x => x == 8)
val span2 = List(1, 2, 3, 4, 5, 6, 7).span(x => x != 4)


val splitat = List(2, 8, 1, 2).splitAt(3)

val partition = List(2, 3, 4, 5,  6).partition(_ % 2 == 0)

val groupby = List(2, 3, 4, 5, 6, 7, 8, 9).groupBy(_ % 2)



val list = List(1, 2, 1, 4)

//list.foldLeft(List[Int]())((list, i) => {
//
//
//})




def sort(list: List[Int]): List[Int] = {

  def loop(l: List[Int], result: List[Int]): List[Int] = {
    list match {
      case x :: y :: xs if x < y => loop(xs, result :+ x :+ y)
      case x :: y :: xs  => loop(xs, result :+ y :+ x)
      case x :: y :: Nil if x < y => loop(Nil, result :+ x :+ y)
      case x :: y :: Nil   => loop(Nil, result :+ y :+ x)
      case _   => result
    }
  }

  loop(list, Nil)

}



