import GreedyAlgorithms._
import org.scalatest.FunSpec
import org.scalatest.Matchers._

class GreedyAlgorithmsTest extends FunSpec {

  describe("Assuming list is arranged from larger to smaller") {
    it("minimum rolls required to fill parameter using just local logic") {
      noOfRolls(List(4, 2, 1), 10) shouldBe((4, 2), (2, 1))
    }

    it("minimum rolls required to fill parameter without mutating and using case class") {
      rollsCount(List(4, 2, 1), 10) shouldBe Choice(0, List(4, 4, 2))
    }


  }

}
