package problems

object Ex10 {
  def encode(in:List[Char]):Unit = {
      var out = List[Tuple2[Char,Int]]()
      for(ch <- in){
          if(out.isEmpty) {
            out = (ch,1) :: out
          }else {
             val head = out.head
             if(head._1 == ch) {
               out = out.tail
               out = (ch,head._2+1) :: out
             } else  out =  (ch,1) ::out
          }
      }
      Console println out.reverse
    }
}
