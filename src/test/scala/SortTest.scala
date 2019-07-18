import org.scalatest.FunSpec
import Sort._
import org.scalatest.Matchers._

class SortTest extends FunSpec {
  it("get max and remaing in list") {
    pickMax(List(1, 10, 3, 7, 9, 2)) shouldBe (10, List(1, 3, 7, 9, 2))
    pickMax(List()) shouldBe (0, List.empty)
    pickMax(List(1, 3, 70, 9)) shouldBe (70, List(1, 3, 9
    ))
  }

  it("bubble sort") {
    bubbleSort(List(1, 10, 3, 7, 9, 2)) shouldBe List(10, 9, 7, 3, 2, 1)
  }
}
