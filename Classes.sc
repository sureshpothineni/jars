package week1

object MainObjext {
	val s = new Sum(1,2)                      //> s  : week1.Sum = 1 Values 2
	s.a1                                      //> res0: Int = 1
	s.a2                                      //> res1: Int = 2
	s.add(s)                                  //> res2: Int = 6
	
	val s1= new Sum(3,4)                      //> s1  : week1.Sum = 3 Values 4
	s.add(s1)                                 //> res3: Int = 10
	
	val s3 = s.+(s1)                          //> s3  : week1.Sum = 4 Values 6
	s3.a1                                     //> res4: Int = 4
	s3.a2                                     //> res5: Int = 6
	s.add(s3)                                 //> res6: Int = 13
	s.add1(s1)                                //> res7: week1.Sum = 4 Values 6
	
	val x = new Sum(1,2)                      //> x  : week1.Sum = 1 Values 2
	val y = new Sum(3,4)                      //> y  : week1.Sum = 3 Values 4
	val z = new Sum(5,6)                      //> z  : week1.Sum = 5 Values 6
	
	//z.sub(x)
	//x.sub(z)
	
	x.max(y)                                  //> res8: Int = 3
	
	z + x                                     //> res9: week1.Sum = 6 Values 8
}

class Sum(a:Int, b:Int) {
	def a1= a
	def a2= b
	
	def this(a:Int) = this(a,1)
	
	def add(that : Sum) = a1 + that.a1 + a2 + that.a2
	
	def add1(that: Sum) = new Sum(a1+ that.a1, a2+that.a2)
	
	override def toString() = a1 + " Values " + a2
	
	def +(that : Sum) = new Sum(a1 + that.a1, a2+that.a2)
	
	def uninary_- :Sum = new Sum(-a1, a2)
	
	def +(that: Sum, that1:Sum) : Int = this.b + -that.a1
	
	private def mul(a :Int, b:Int) = a * b

	def max(that: Sum) = if (this.a1 > that.a1) this.a1 else that.a1
	
}