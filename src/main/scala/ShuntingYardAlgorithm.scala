
// If we have a mathematical expression its not easy to find a programming solution as it has inflix notations
// and evalution is done by operator precedence for example multiplication is done first then addition etc
//When we have to compare operators if * has more precedence over - we move * to left and move - to bottom
// we dont compare ( when working on brackets
// when we encounter ) we flush every thing until ( to left and then we get rid of ( and this)
//  this is evaluated by three way junction
//first we encode expression in a different format and then evaluate an answer . we use postfix operator first
// 2 + 1 becomes  2 1 +
// 5 + 7 / 2 becomes 5 7 2 / +
// (5 + 7) / 2 becomes 5 7 + 2 /
object ShuntingYardAlgorithm {


 def evaluate(postFix: List[String]): Double = {

   postFix.foldLeft(List[Double]())((nStack, token) => {

     (nStack, token) match {
       case (a :: b :: tail, "+") => (a + b) +: tail
       case (a :: b :: tail, "-") => (a - b) +: tail
       case (a :: b :: tail, "*") => (a * b) +: tail
       case (a :: b :: tail, "/") => (a / b) +: tail
       case (_, n) => n.toDouble +: nStack
     }
   }).head

 }}


