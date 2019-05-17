

// WE decide on each iteration what to do next that we make locally optimal solution at each stage , In this we take value from largest to smallest
// this is easy to implement
// they dont provide a globally optimal solution
object GreedyAlgorithms {



  def noOfRolls(list: List[Int], parameter: Int): List[(Int, Int)] = {
    def loop(l: List[Int], parameter: Int, result: List[(Int, Int)]): List[(Int, Int)] = {
      l match {
        case x :: xs if parameter > x => {
          val eval = inc(x, parameter)
          loop(xs, eval._2, result :+ (x, eval._1))
        }
        case x :: xs :: Nil => {
          val eval = inc(xs, parameter)
          loop(Nil, eval._2, result :+ (xs, eval._1))
        }
        case x :: xs :: tail => {
          val eval = inc(xs, parameter)
          loop(tail, eval._2, result :+ (xs, eval._1))
        }
        case Nil => result
      }
    }

    loop(list, parameter, List.empty)
  }

  //Better solution follows all the principles of functional programming
  def rollsCount(list: List[Int], parameter: Int) = {
    list.foldLeft(Choice(parameter, List.empty))((choice, length) => {
      val multiple = choice.parameter / length
      val reelsToBuy = List.fill(multiple)(length)
      Choice(choice.parameter - multiple * length, choice.reels ::: reelsToBuy)
    })
  }

  private def inc(i: Int, parameter: Int): (Int, Int) = (parameter / i, parameter % i)
}


case class Roll(rollLength: Int, count: Int)

case class Choice(parameter: Int, reels: List[Int])