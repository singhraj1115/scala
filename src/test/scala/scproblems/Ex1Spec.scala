package scproblems

import org.scalatest.{FlatSpec, Matchers}

class Ex1Spec extends FlatSpec with Matchers {
    import Ex1._
   "" should "" in {
     val arr1 = Array(2,7,11,15)
     println(findTarget(arr1,9))
   }
}
