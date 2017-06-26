package week3

object ListExamples {
  def main(args: Array[String]) : Unit ={
    val x : List[Int] = List(1,2,3,4,5,6,7,8,9)
    val y : List[String] = List("Apple","Banana")
    
    val y1 = List("Apple",1)
    
    val z = 1 :: (2 :: (3 :: (4 :: Nil)))
    val z1 = "1" :: ("2" :: ("3" :: ("4" :: Nil)))
    var z2 : List[String] = "1" :: "2" :: Nil 
    val z3 : List[String] = "1" :: "4" :: Nil
    
    val z4 = z2 :: (z3 :: Nil)
    
    val z5 = z2 ::: z3

    println("z4 :"+z4)
    println("z5 :"+z5)
    
    z2= z2.:::(List("10"))
    println("z2:"+z2)
    val z6 = z2.:::(z3)
    println("z6"+z6)
    val z7 = z2.drop(1)
    println(z7)
    
    println(z2 head)
    println(z2.tail)
    println(z2.last)
    
    def meth1(x: List[Any]) : Int = x match {
      case Nil => 1
      case x :: xs => {println(x); println(xs); meth1(xs) }
    }
    
    //println(meth1(x))

    val a: Range = 1 until 10
    println("a "+a)
    a.foreach(x => x+1)
  
    a map (x => x+1)
  }
  
}