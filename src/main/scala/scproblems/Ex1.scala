package scproblems

object Ex1 {
  def findTarget(in:Array[Int],target:Int): Unit ={
      var map = Map[Int,Int]();
      for(index <- 0 to in.length - 1)
        map += (in(index) -> index)

     for(element <- in.zipWithIndex) {
         val remValue = target - element._1
         if(map.contains(remValue)){
            val index = map.get(remValue).get
            val newIndex = (element._2,index)
            println("Index :: "+newIndex)
            return ;
         }
     }
  }

  def main(args: Array[String]): Unit = {
    val arr1 = Array(2,15,11,15,15,7)
    println(findTarget(arr1,9))
    println(findTarget(arr1,26))
    println(findTarget(arr1,22))
    println(findTarget(arr1,17))
    println(findTarget(arr1,30))
    /*for(ele <- arr1.zipWithIndex){
      println(ele._1+" "+ele._2)
    }*/

  }
}
