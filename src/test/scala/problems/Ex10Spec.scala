package problems

import org.scalatest.{FlatSpec, Matchers}

class Ex10Spec extends FlatSpec with Matchers {
  import Ex10._
  "encode method " should "return " in {
      val list1 = List('a', 'a', 'a', 'a', 'b', 'c', 'c', 'a', 'a', 'd', 'e')
      encode(list1)
  }

}
