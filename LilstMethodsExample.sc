package week3

object LilstMethodsExample {
  val str = "suresh babu pothineni"               //> str  : String = suresh babu pothineni
  

  str flatMap {x => ("."+x)}                      //> res0: String = .s.u.r.e.s.h. .b.a.b.u. .p.o.t.h.i.n.e.n.i
  
  str map {x => ("."+x)}                          //> res1: scala.collection.immutable.IndexedSeq[String] = Vector(.s, .u, .r, .e,
                                                  //|  .s, .h, ". ", .b, .a, .b, .u, ". ", .p, .o, .t, .h, .i, .n, .e, .n, .i)
  
	val fruits = List("apple suresh banana orange suesh babu pothineni teest adfasd alkjsdfkjlk  ")
                                                  //> fruits  : List[String] = List("apple suresh banana orange suesh babu pothine
                                                  //| ni teest adfasd alkjsdfkjlk  ")
	
	fruits.map(_.split(" "))                  //> res2: List[Array[String]] = List(Array(apple, suresh, banana, orange, suesh,
                                                  //|  babu, pothineni, teest, adfasd, alkjsdfkjlk))
	
	fruits.flatMap(x => x.split(" "))         //> res3: List[String] = List(apple, suresh, banana, orange, suesh, babu, pothin
                                                  //| eni, teest, adfasd, alkjsdfkjlk)
	

  str.exists { x =>
  	x.isUpper
  }                                               //> res4: Boolean = false
 	val x = List(1)                           //> x  : List[Int] = List(1)
 	val y = List(4,5,6)                       //> y  : List[Int] = List(4, 5, 6)
 
  def test(x11: List[Int]) (f : Int => Int) : List[Int] ={
  	new :: (f(x11.head), Nil)
  }                                               //> test: (x11: List[Int])(f: Int => Int)List[Int]
  test(x)(x1 => x1*2)                             //> res5: List[Int] = List(2)
  
  //x map (x => x * 2)
  
  x.foldLeft(1){(x,y) => println(x+" "+y);x +y}   //> 1 1
                                                  //| res6: Int = 2
  
  x.reduceLeft{(x,y) => println(x+" "+y);x +y}    //> res7: Int = 1

  x.reduceRight{(x,y) => println(x+" "+y);x +y}   //> res8: Int = 1
	(1 until 5) flatMap (
		i => (1 until i) map (
			j => (i, j)
		)
	)                                         //> res9: scala.collection.immutable.IndexedSeq[(Int, Int)] = Vector((2,1), (3,1
                                                  //| ), (3,2), (4,1), (4,2), (4,3))
	
	(1 until 5) map (i => (1 until i)
		map (	j => (i, j)))             //> res10: scala.collection.immutable.IndexedSeq[scala.collection.immutable.Inde
                                                  //| xedSeq[(Int, Int)]] = Vector(Vector(), Vector((2,1)), Vector((3,1), (3,2)), 
                                                  //| Vector((4,1), (4,2), (4,3)))


}