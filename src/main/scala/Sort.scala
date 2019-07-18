object Sort {


  def bubbleSort(list: List[Int]): List[Int] = {
    def loop(l: List[Int], result: List[Int]): List[Int] = {
      l match {
        case x :: xs => {

          val p = pickMax(l)

          loop(p._2, result :+ p._1)
        }
        case Nil => result
      }
    }

    loop(list, List.empty[Int])
  }

  def pickMax(list: List[Int]): (Int, List[Int]) = {

    def loop(l: List[Int], result: (Int, List[Int])): (Int, List[Int]) = {
      l match {
        case x :: xs if x > result._1 => loop(xs, (x, result._2 :+ result._1))
        case x :: xs => loop(xs, (result._1, result._2 :+ x))
        case Nil => result
      }
    }

    if(list.isEmpty)
      (0, List.empty[Int])
    else
    loop(list.tail, (list.head, List.empty[Int]))
  }
}
