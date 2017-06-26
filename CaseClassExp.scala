package week3

object CaseClassExp {
  def main(args: Array[String]){
    val n1 = Number
    val n = new Number(10)
    println(n + 1)
    n.-(3)
    println(n.toString())
    val x = Sum(Sum(Number(1), Number(2)), Number(3))
    
    def matching(x: Exp) : Int = x match {
      case Number(x) => x
      case Sum(x, r) => matching(x) + matching(r) 
      case _ => 1
    }
    matching(Number(1))
  }
}

abstract class Exp {
  def +(n : Int) : Int = n+1
  def -(n : Int) : Int = n-1
}

case class Number(n: Int) extends Exp

case class Sum(e: Exp, e1: Exp) extends Exp