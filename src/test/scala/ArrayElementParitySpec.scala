import org.scalatest._

class ArrayElementParitySpec extends WordSpec with MustMatchers {

  "Array Element Parity" must {

    "When given a list of 1 return 1" in {
      ArrayElementParity.uniqueNum(List(1)) mustEqual 1
    }

    "when given a list of -1, 1 and 2 return 2" in {
      ArrayElementParity.uniqueNum(List(-1, 1, 2)) mustEqual 2
    }

    "when given a list of -1, 1, -2, 2, -3, 3, 4 return 4" in {
      ArrayElementParity.uniqueNum(List(-1, 1, 2, -2, 3, -3, 4)) mustEqual 4
    }

    "when given a list of -3, 1, 2, 3, -1, -4, -2 return -4" in {
      ArrayElementParity.uniqueNum(List(-1, 1, 2, -2, 3, -3, -4)) mustEqual -4
    }

    "when given a list of 1, -1, 2, -2, 3, 3 return 3" in {
      ArrayElementParity.uniqueNum(List(1, -1, 2, -2, 3, 3)) mustEqual 3
    }

    "when given a list of 1, -1, 2, -2, -3, -3 return 3" in {
      ArrayElementParity.uniqueNum(List(1, -1, 2, -2, -3, -3)) mustEqual -3
    }

  }

}
