package practise.cookbook.collection

/**
  * Created by hadoop on 19/9/17.
  */
object Ex1 {
  def main(args: Array[String]): Unit = {
   // about predicate
    println(isEven(12))
    println(isEven(15))

    val list  = List.range(1,10)
    println(list)

    val evenList = list.filter(isEven)
    println(evenList)

    val oddList = list.filter(isOdd)
    println(oddList)

    val eventList1 = list.filter((i:Int) => i%2 == 0 )
    println(eventList1)

    val oddList1 = list.filter((i:Int) => i%2 != 0 )
    println(oddList1)

    val evenList2 = list.filter(_%2 != 0)
    println(evenList2)

    val oddList2 = list.filter(_%2==0)
    println(oddList2)

    val finalList = for { e <- list ; if( e %2 == 0) } yield e
    println(finalList)

  }
  def isEven(i:Int) = if(i%2 == 0 ) true else false

  def isOdd(i:Int) = if(i%2 != 0) true else false
}
