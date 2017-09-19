package problems

object P09 {
  def main(args: Array[String]): Unit = {
      //val list:List[Char] = List('a', 'a', 'a', 'a', 'b', 'c', 'c', 'a', 'a', 'd', 'e', 'e', 'e', 'e')
      val list:List[Char] = List()
      println(pack1(list))
  }
  def pack1(inList:List[Char]):List[List[Char]] = {
      var main:List[List[Char]] = List()
      var newList:List[Char] = List()
      for(ch <- inList) {
         if(newList.isEmpty)
           newList = ch::newList
         else {
           if(ch == newList.head)
             newList = ch:: newList
           else {
             newList = newList
             main = newList :: main
             newList = Nil
             newList = ch :: newList
           }
         }
      }
    main reverse
  }
  def pack2(inList:List[Char],mainList:List[List[Char]]=Nil,newList:List[Char] = Nil) = {

  }
}







