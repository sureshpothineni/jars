package week4

object ListFun {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  var l : List[Int] = List(2, 3, -4, 6, 7, 1)     //> l  : List[Int] = List(2, 3, -4, 6, 7, 1)
	(l take 1) ::: (l drop 1+1)               //> res0: List[Int] = List(2, -4, 6, 7, 1)
	 
	l = l ::: 10 :: 20 :: Nil
	
	l                                         //> res1: List[Int] = List(2, 3, -4, 6, 7, 1, 10, 20)
	
  l takeWhile (x => x > 0)                        //> res2: List[Int] = List(2, 3)
  l dropWhile (x => x > 0)                        //> res3: List[Int] = List(-4, 6, 7, 1, 10, 20)
  l span ( y => y == 0)                           //> res4: (List[Int], List[Int]) = (List(),List(2, 3, -4, 6, 7, 1, 10, 20))
  
  l.partition { x => x > 0 }                      //> res5: (List[Int], List[Int]) = (List(2, 3, 6, 7, 1, 10, 20),List(-4))
  val l1 = List("a","a","a","b","c","a")          //> l1  : List[String] = List(a, a, a, b, c, a)
  
  def pack[T]( xs: List[T]) : List[List[T]] = xs match {
  	case Nil => Nil
  	case x :: xs1 =>
  		val (first, rest) = xs span (y => y == x)
  		first :: pack(rest)
  }                                               //> pack: [T](xs: List[T])List[List[T]]
  pack(l1) map ( ys => (ys.head, ys.length))      //> res6: List[(String, Int)] = List((a,3), (b,1), (c,1), (a,1))

	val l2 = List("Su ba su ta su ba su ta io")
                                                  //> l2  : List[String] = List(Su ba su ta su ba su ta io)
		
	l2 map( x => x.split(" ").map { x1 =>
		val eachVal = x1
		(eachVal, 1)
	})                                        //> res7: List[Array[(String, Int)]] = List(Array((Su,1), (ba,1), (su,1), (ta,1)
                                                  //| , (su,1), (ba,1), (su,1), (ta,1), (io,1)))
	
	val l3 = List(1,2,3,4,5)                  //> l3  : List[Int] = List(1, 2, 3, 4, 5)
	
	def sum(xs : List[Int]) = xs reduceLeft (_ + _)
                                                  //> sum: (xs: List[Int])Int
	sum(l3)                                   //> res8: Int = 15
	def sum1(xs : List[Int]) = (xs foldLeft 1) (_ + _)
                                                  //> sum1: (xs: List[Int])Int
	sum1(l3)                                  //> res9: Int = 16


	def reverse[T](xs : List[T]) : List[T] = xs match {
		case Nil => Nil
		case x :: xs1 => reverse(xs1) ::: List(x)
	}                                         //> reverse: [T](xs: List[T])List[T]
	reverse(List())                           //> res10: List[Nothing] = List()
}