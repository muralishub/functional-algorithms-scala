import java.io.{File, FileWriter, PrintWriter}
import org.scalatest.FunSpec
import scala.util.Random
import org.scalatest.Matchers._

class ReverseListTest extends FunSpec {

  it("reverse a list") {
    ReverseList.reverseAList(List(1, 2, 3, 4)) shouldBe List(4, 3, 2, 1)
  }









  private def  writeToFile = {
          val pw = new PrintWriter(new File("hello.txt"))
      for(i <- 1 to 5000000) {
        pw.write(Random.nextInt(5000000) + "\n")
      }
      pw.close()
  }
}
