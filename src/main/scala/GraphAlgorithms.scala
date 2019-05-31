object GraphAlgorithms {

// get succesors of a given value
  def succSet(k: String, l: List[(String, String)]): List[String] = {
    def loop(list: List[(String, String)], acc: List[String]): List[String] = {
      list match {
        case x :: xs if x._1 == k => loop(xs, acc :+ x._2)
        case x :: xs => loop(xs, acc)
        case Nil => acc
      }
    }
    loop(l, List.empty[String])
  }

  val graph = List(("m", "n"), ("m", "o"), ("m", "p"), ("n", "q"), ("o", "r"), ("p", "q"), ("q", "r"), ("q", "s"))




  // Depth first graph algorithm
  def depthFirst(initial: String, g: List[(String, String)]): List[String] = {

    def depthf(nodes: List[String], visited: List[String]): List[String] = nodes match {
      case Nil => visited
      case x :: xs if visited.contains(x) => depthf(xs, visited)
      case x :: xs => depthf(succSet(x, g) ++ xs, visited :+ x)
    }


    val result = depthf(List(initial), List())

    result
  //  result.reverse


  }








}
