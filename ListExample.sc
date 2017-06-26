package week4


object ListExample {
  val l =  List(2,2,3,4,5,6,7,8,9)                //> l  : List[Int] = List(2, 2, 3, 4, 5, 6, 7, 8, 9)
  val k : List[Int] =  List(10,20,30,40,50,60,70,80)
                                                  //> k  : List[Int] = List(10, 20, 30, 40, 50, 60, 70, 80)
  
	(1 until 5) map (x => (x,1))              //> res0: scala.collection.immutable.IndexedSeq[(Int, Int)] = Vector((1,1), (2,1
                                                  //| ), (3,1), (4,1))
  l.map { x => (x,1) }                            //> res1: List[(Int, Int)] = List((2,1), (2,1), (3,1), (4,1), (5,1), (6,1), (7,1
                                                  //| ), (8,1), (9,1))
  val x = for ( i <- l zip k) yield (i)           //> x  : List[(Int, Int)] = List((2,10), (2,20), (3,30), (4,40), (5,50), (6,60),
                                                  //|  (7,70), (8,80))
  println(x)                                      //> List((2,10), (2,20), (3,30), (4,40), (5,50), (6,60), (7,70), (8,80))
  
  
  val x1= for (i1 <- (1 to 10) ; i1 <- (1 to 5); if i1 == 5) yield(i1)
                                                  //> x1  : scala.collection.immutable.IndexedSeq[Int] = Vector(5, 5, 5, 5, 5, 5, 
                                                  //| 5, 5, 5, 5)
  val l1 : List[String] = List("a","b")           //> l1  : List[String] = List(a, b)
  
  val l2 = 1 :: 2 :: 3 :: 4 :: Nil                //> l2  : List[Int] = List(1, 2, 3, 4)
  
  val l3 = 4 :: 3 :: Nil                          //> l3  : List[Int] = List(4, 3)
  
  l2 ++ l3                                        //> res2: List[Int] = List(1, 2, 3, 4, 4, 3)
  
  val l4 = l2.splitAt(2)                          //> l4  : (List[Int], List[Int]) = (List(1, 2),List(3, 4))
  l4._1                                           //> res3: List[Int] = List(1, 2)
  
  l.partition(x => x % 2 == 0)                    //> res4: (List[Int], List[Int]) = (List(2, 2, 4, 6, 8),List(3, 5, 7, 9))
  l.takeWhile { x => x % 2 == 0 }                 //> res5: List[Int] = List(2, 2)
  
  val a1 = Array(1,3,2,5,4)                       //> a1  : Array[Int] = Array(1, 3, 2, 5, 4)
  val a2 = Array(6,7,8)                           //> a2  : Array[Int] = Array(6, 7, 8)
  (a1 ++ a2).reverse                              //> res6: Array[Int] = Array(8, 7, 6, 4, 5, 2, 3, 1)
  a1.sorted                                       //> res7: Array[Int] = Array(1, 2, 3, 4, 5)
  
  a1.update(4, 7)
	println(a1)                               //> [I@8bd1b6a
	
	val s = "aabbBCaabb"                      //> s  : String = aabbBCaabb
	s.replaceAll("BC", "X")                   //> res8: String = aabbXaabb
  
}