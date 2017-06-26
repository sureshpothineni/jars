package week1

object ClassHirarchy3 {
  
  def main(args : Array[String]) {
    println("Welcome to the Scala worksheet")
    
    val subC = new SubClass10(1,2)
    println (subC common(1,2))
  }
}

object ClassHirarchy2 {
  
  def main(args : Array[String]) {
    println("Welcome to the Scala worksheet 2")
    
    val subC = new SubClass10(1,2)
    println (subC common(1,2))
  }
}

abstract class SuperClass1 {
	def common(a:Int, b:Int) : SuperClass1
	def sum1(a:Int) : Int
	def sum1(a:Int, b:Int, c:Int) : Int = a+b+c

}

class SubClass10(i:Int, j:Int) extends SuperClass1 {

	override def sum1(a:Int, b:Int, c:Int) = a+b+c
	override def sum1(a:Int) = a
	override def common(a:Int, b:Int) = new SubClass2(a,b)
	
}

class SubClass2(a:Int, b:Int) extends SuperClass1{
	override def sum1(a:Int, b:Int, c:Int) = a+b+c
	override def sum1(a:Int) = a
	override def common(a:Int, b:Int) = new SubClass2(4,5)
	
	override def toString = a + " " +b

}