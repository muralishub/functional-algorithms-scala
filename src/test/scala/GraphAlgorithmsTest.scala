import org.scalatest.FunSpec
import GraphAlgorithms._
import org.scalatest.Matchers._


class GraphAlgorithmsTest extends FunSpec {

  it("get values in pair that matchers a perticular key") {
    succSet("m", graph) shouldBe List("n", "o", "p")
    graph.filter(_._1 == "m").map(_._2) shouldBe List("n", "o", "p")

    depthFirst("m", graph) shouldBe List("n", "o",  "p")
  }



}
