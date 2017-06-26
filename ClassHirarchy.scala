package week3

object ClassHirarchy {
  def main(args: Array[String]) = {
    println("Welcome to the Scala worksheet")
    
    val subC = new SubClass10(1,2)
    println (subC common(1,2))
    println (subC sum1(1,2,3)) 
    val subD = new SubClass2(2,3)
    println( subD sum1(1,2,3))
    val a1 = new Add10()
    println(a1.x)
    a1.x=30
    println(a1.x)
  }
}

trait Addition {
  def add(a:Int, b:Int): Int
  def add1(a:Int, b:Int): Int = a+b
  var x =10
  var y=20
}

trait Additioon1  {
  def add2(a:Int, b:Int) : Int
  def add3(a:Int, b:Int) : Int
}

class A {
  
}

class Add10 extends Addition with Additioon1 {
  override def add(a:Int, b:Int) :Int = a+b
  //override def add1(a:Int, b:Int) : Int = a+b
  def add3(a:Int, b:Int) :Int = a*b
  override def add2(a:Int, b:Int) :Int = a+b
  val x1 = if (true) 1 else false
  println(x)
}

abstract class SuperClass1 {
	def common(a:Int, b:Int) : SuperClass1
	def sum1(a:Int) : Int
	def sum1(a:Int, b:Int, c:Int) : Int = a+b+c
}

class SubClass10(i:Int, j:Int) extends SuperClass1 {

	override def sum1(a:Int, b:Int, c:Int) = a+b*c
  def sum1(a:Int) = a
  def common(a:Int, b:Int) = new SubClass2(a,b)
	
}

class SubClass2(a:Int, b:Int) extends SuperClass1 {
	override def sum1(a:Int, b:Int, c:Int) = a+b+c
  def sum1(a:Int) = a
	def common(a:Int, b:Int) = new SubClass2(4,5)
	
	override def toString = a + " " +b
}