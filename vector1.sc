package week5

object vector1 {
	val v = Vector(1,2,3,4,1,2,3,4,1,2,3,4,1,2,3,4,1,2,3,4,1,2,3,4,1,2,3,4,1,2,3,4,1,2,3,4,1,2,3,4,1,2,3,4,1,2,3,4,1,2,3,4,1,2,3,4,1,2,3,4)
                                                  //> v  : scala.collection.immutable.Vector[Int] = Vector(1, 2, 3, 4, 1, 2, 3, 4,
                                                  //|  1, 2, 3, 4, 1, 2, 3, 4, 1, 2, 3, 4, 1, 2, 3, 4, 1, 2, 3, 4, 1, 2, 3, 4, 1, 
                                                  //| 2, 3, 4, 1, 2, 3, 4, 1, 2, 3, 4, 1, 2, 3, 4, 1, 2, 3, 4, 1, 2, 3, 4, 1, 2, 3
                                                  //| , 4)
	val v1 = Vector(5)                        //> v1  : scala.collection.immutable.Vector[Int] = Vector(5)
	v.length                                  //> res0: Int = 60
	Vector.fill(6)("* ").updated(2, "X ")     //> res1: scala.collection.immutable.Vector[String] = Vector("* ", "* ", "X ", "
                                                  //| * ", "* ", "* ")
	
	val s: String = "Hello World"             //> s  : String = Hello World
	
	s.flatMap(c => List(".",c))               //> res2: scala.collection.immutable.IndexedSeq[Any] = Vector(., H, ., e, ., l, 
                                                  //| ., l, ., o, .,  , ., W, ., o, ., r, ., l, ., d)
	s.map(c => List(".",c))                   //> res3: scala.collection.immutable.IndexedSeq[List[Any]] = Vector(List(., H), 
                                                  //| List(., e), List(., l), List(., l), List(., o), List(.,  ), List(., W), List
                                                  //| (., o), List(., r), List(., l), List(., d))
  val m= List(1,2,3,4, 5)                         //> m  : List[Int] = List(1, 2, 3, 4, 5)
  var n = List(1,2,3,4)                           //> n  : List[Int] = List(1, 2, 3, 4)
  
  m map { x =>  n map {y => (x,y)} }              //> res4: List[List[(Int, Int)]] = List(List((1,1), (1,2), (1,3), (1,4)), List((
                                                  //| 2,1), (2,2), (2,3), (2,4)), List((3,1), (3,2), (3,3), (3,4)), List((4,1), (4
                                                  //| ,2), (4,3), (4,4)), List((5,1), (5,2), (5,3), (5,4)))
  m flatMap { x => n map {y =>  (x,y)} }          //> res5: List[(Int, Int)] = List((1,1), (1,2), (1,3), (1,4), (2,1), (2,2), (2,3
                                                  //| ), (2,4), (3,1), (3,2), (3,3), (3,4), (4,1), (4,2), (4,3), (4,4), (5,1), (5,
                                                  //| 2), (5,3), (5,4))
  (m zip n) map { case(x,y) => x*y }              //> res6: List[Int] = List(1, 4, 9, 16)
  
   def isPrime(n : Int)  = {
  	(2 until n) forall {n % _ != 0}
  }                                               //> isPrime: (n: Int)Boolean
  
  val n1 =7                                       //> n1  : Int = 7
  
  for {
  	i <- 1 until n1
  	j <- 1 until i
  	if isPrime(i+j)
  } yield(i,j)                                    //> res7: scala.collection.immutable.IndexedSeq[(Int, Int)] = Vector((2,1), (3,2
                                                  //| ), (4,1), (4,3), (5,2), (6,1), (6,5))
  (1 until n1) flatMap
  	(i => (1 until i) map (j => (i,j))) filter { case(x,y) => isPrime(x+y ) }
                                                  //> res8: scala.collection.immutable.IndexedSeq[(Int, Int)] = Vector((2,1), (3,2
                                                  //| ), (4,1), (4,3), (5,2), (6,1), (6,5))
	n = n.updated(1, 10)
	println(n)                                //> List(1, 10, 3, 4)
	
	val v2 = Vector(5)                        //> v2  : scala.collection.immutable.Vector[Int] = Vector(5)
	
	(for ( i <- 1 to 50 if isPrime(i)) yield i) mkString(":")
                                                  //> res9: String = 1:2:3:5:7:11:13:17:19:23:29:31:37:41:43:47
	
}