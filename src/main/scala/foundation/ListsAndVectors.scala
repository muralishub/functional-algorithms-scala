package foundation
import java.util.{Calendar, Date}

object ListsAndVectors extends App{




  val list = List(1, 2, 3, 4, 5, 6, 7, 8, 9)

 // val result1 = list.sliding()
















  def calcFactorial(x: Int): Int = {
    if(x == 0 || x == 1) 1
    else {
      println("computing factorial")
      x * calcFactorial(x - 1)
    }
  }
 val result =  calcFactorial(5)

 }


class FactorialMemoiz {
  var cache: Map[Int, Int] = Map()

  def lookup(num: Int): Int = cache.getOrElse(num, 0)

  def calcFactMemoiz(x: Int): Int = {
    if(x == 0 || x == 1) 1
    else if(lookup(x) > 0) {
      println("Performing lookup")
      lookup(x)
    } else {
      println("performing calculation")
      val factorial = x * calcFactMemoiz(x - 1)
      cache += x -> factorial
      factorial
    }

  }
}


