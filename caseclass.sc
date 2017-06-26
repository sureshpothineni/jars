package week4

object caseclass {
	println("test")                           //> test
	
	def test( x: => Double) : Int = 1         //> test: (x: => Double)Int
	
	test(1.0)                                 //> res0: Int = 1
	
	//val f = new Function1[T, U] {
//		def apply(x : T) : U = x
	//}
	//f.apply(Nil)
	
		case class test (a: Int, b: Int, c : Int)
}