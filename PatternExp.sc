package week4

object PatternExp {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  def flattern(a : List[Any]) : List[Any] = {
  	a match {
  		case Nil => List()
  		case y :: ys => y match {
  											case y1 :: y2 => {List(y1)++ flattern(y2)++flattern(ys)}
  											case y3 => {List(y3)++flattern(ys)}
  										}
  	}
  	
  }                                               //> flattern: (a: List[Any])List[Any]
  val l = List(List(1,List(1,3,4)),2, List(3,List(4,5)))
                                                  //> l  : List[Any] = List(List(1, List(1, 3, 4)), 2, List(3, List(4, 5)))
  flattern(l)                                     //> res0: List[Any] = List(1, 1, 3, 4, 2, 3, 4, 5)

	def removeAt(values : List[Int], n: Int) : List[Int] = {
		values match {
			case Nil => List()
			case y :: ys =>
				if (n ==0) ys  else y :: removeAt(ys, n-1)
		}
	}                                         //> removeAt: (values: List[Int], n: Int)List[Int]
	
	val l1 = List(4,6,7,8,9)                  //> l1  : List[Int] = List(4, 6, 7, 8, 9)
	println(removeAt(l1, 2))                  //> List(4, 6, 8, 9)
	
	def fib1(n : Int) : Int ={
		n match {
			case 1 | 0 => n
			case _ => fib1(n-1) + fib1(n-2)
		}
	}                                         //> fib1: (n: Int)Int
	fib1(6)                                   //> res1: Int = 8
}