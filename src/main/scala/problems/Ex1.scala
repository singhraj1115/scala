package problems

/**
  * Created by hadoop on 19/9/17.
  */
object Ex1 {
  def main(args: Array[String]): Unit = {
    val inList = List('a','a','a','b','b','c','c','a','a','d','e','e')
    //val inList = Nil
    println(compress(inList))
  }
  def compress(inList:List[Char],out:List[Char]=Nil):List[Char] = {
    inList match {
      case Nil => out reverse
      case x::tail => out match {
        case Nil => compress(tail,x::out)
        case _ => if(x == out.head) compress(tail,out) else compress(tail,x::out)

      }
    }
  }
}
