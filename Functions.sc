package week1

object Functions {

	val a : Array[String] = Array()
	a(0)="Suresh"
	a(1)="Babu"
	a(2)="Poth"
	
	def sumInts(a:Int, b:Int) : Int = if ( a> b) 0 else a + sumInts(a+1,b)
	
	def sumCub(a:Int, b:Int): Int =
		if(a>b) 0 else cub(a) + sumInts(a,b)

	def id(x : Int):Int = x
	def cub(x: Int): Int = x * x * x
	def sumFact(a : Int) : Int = if (a == 0) 0 else sumFact(a-1)
	
	def sum1(f: Int => Int, a:Int, b:Int): Int = {
		println("F"+f(a))
		println("a"+a)
		if (a ==0) 0 else f(a) + sum1(f,a-1, b)
	}
	
  def sumInt(x: Int) : Int = sum1(id, x, 10)
  def sumCube(x: Int) : Int = sum1(cub, x, 10)
  def sumFacto(x: Int) : Int = sum1(sumFact, x, 10)
  sumInt(2)
  // Anonymous Function
  def anonymousSumCube(a:Int, b:Int) : Int = sum1(x => x * x* x, a, b)
	//anonymousSumCube(3,4)
	
	def tailRecursion(f: Int => Int, a:Int, b:Int): Int = {
		def load(a:Int, acc: Int): Int =
			if (a > b) acc else load(a+1, f(a)+acc)
		load(a, 0)
	}

  def sum(f: Int => Int): (Int, Int) => Int = {
  	def sumF(a:Int, b:Int): Int =
  		 f(a)
  	sumF
  }
  
  val sumx = sum( x=> x)
  sumx(1,2)
  
  sumInts(1,2)
  def sumCubs = sum(x => x * x * x)
  
  sum(x => x * x * x)(1,2)
  //sumCubs(1,2)
  
  def sum2(f: Int =>Int)(a:Int, b:Int) : Int =
  	if(a > b) 0 else f(a) + sum2(f)(a+1, b)
  
  sum2(x => x * x * x)(1,2)

	def test1(f: (Int,Int,Int,Int) => Int) (a:Int, b:Int, c:Int, d:Int) : Int =
		f(a,b,c,d)
  test1( (x,y,z,a) => x+y+z+a) (1,2,3,4)
  	
  def test2(f: (Int,Int,Int,Int)  => Int, a:Int, b:Int, c:Int, d:Int) : Int =
   f(a,b,c,d)
  test2((x,y,z,a) => x+y+z+a, 1,2,3,4)

	def test3(f: (Int, Int) => Int) : (Int, Int) => Int = {
		def sumF(a:Int, b:Int) :Int =
			f(a,b)
		sumF
	}
	
	def addSum = test3( (a:Int, b:Int) => a+b)
	
	addSum(1,2)
	
	
	//def multi(f: (Int,Int) => Int) : ( Int, Int) (Int, Int) => Int = f(a,b)
	
	//val x = multi( (x:Int,y:Int) => x*y)
	
	def sub(f: (Int,Int) => Int, a:Int, b:Int) : Int = f(a,b)
	
	def sub(f: (Int,Int) => Int) : (Int, Int) => Int = {
		def subt(a:Int, b:Int) : Int = f(a,b)
		subt
	}
	
	def sub10(f: (Int,Int) => Int) (a: Int, b: Int) (c:Int, d:Int) : Int = f(a,b)
	
	val f = sub10((x:Int,y:Int) => x-y)(3,4)(5,6)
	
	val meth1: (Int => Int) = (arg : Int) => { 0 }
	
	def meth2 (a: Int) : Int = 0
	
	val f1 = new Function3[Int, Int, Int, Int] {
		def apply(x : Int, x1:Int, x3:Int) = x+x1+x3
	}
	val x = f1.apply(1,2,3)
	println(x)
	
}