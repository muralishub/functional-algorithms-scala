object ReverseList {

  def reverseAList(l: List[Int]): List[Int] = {

    def loop(oldList: List[Int], newList: List[Int]): List[Int] = {
      oldList match {
        case x :: xs => loop(xs, x +: newList)
        case Nil => newList
      }
    }
    loop(l, List.empty[Int])
  }

}
