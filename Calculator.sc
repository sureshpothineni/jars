package dynamicprogram

object Calculator {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  var sum =0                                      //> sum  : Int = 0
  
  def calculator[T](xs : List[Char]) : Any ={
  	xs match {
  		case Nil => Nil
  		case x1 :: xs1 =>
  			xs1 match {
  				case Nil => x1 :: Nil
  				case y1 :: ys =>
  					ys match {
		  				case Nil => y1 :: Nil
  						case y2 :: ys1 => {
  								println("x1 :"+x1+"y1 :"+y1+": y2 :"+y2+" ys1: "+ys1+" ys: "+ys+"x1.toInt :"+x1)
  								if(y1.toString().equals("+")) {
  									println("Operation +")
	  								sum = sum + (x1 + y2)
  								} else if (y1.toString().equals("*")) {
  									println("Operation *")
	  								sum = sum + (Char.char2int(x1) * Char.char2int(y2))
  								}
  								println("sum :"+sum+" x1 :"+Char.char2int(x1)+" y2 :"+Char.char2int(y2))
  								println("ys1 :"+ys1)
  								calculator(ys1.tail)}
  					 }
  			 }
  	}
  	sum
  }                                               //> calculator: [T](xs: List[Char])Any
  
  val str = "11*3+3+4+5"                          //> str  : String = 11*3+3+4+5
  calculator(str.toList)                          //> x1 :1y1 :1: y2 :* ys1: List(3, +, 3, +, 4, +, 5) ys: List(*, 3, +, 3, +, 4, 
                                                  //| +, 5)x1.toInt :1
                                                  //| sum :0 x1 :49 y2 :42
                                                  //| ys1 :List(3, +, 3, +, 4, +, 5)
                                                  //| x1 :+y1 :3: y2 :+ ys1: List(4, +, 5) ys: List(+, 4, +, 5)x1.toInt :+
                                                  //| sum :0 x1 :43 y2 :43
                                                  //| ys1 :List(4, +, 5)
                                                  //| res0: Any = 0
}


/// {sum = x1 + y1;
//  																									 sum :: calculator(ys1)}