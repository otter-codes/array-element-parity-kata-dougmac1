import org.scalatest._

class ArrayElementParitySpec extends WordSpec with MustMatchers {

  "Array Element Parity" must {

    "When given a list of 1 return 1" in {
      ArrayElementParity.uniqueNum(List(1)) mustEqual 1
    }

    "when given a list of -1, 1 and 2 return 2" in {
      ArrayElementParity.uniqueNum(List(-1, 1, 2)) mustEqual 2
    }

  }

}
