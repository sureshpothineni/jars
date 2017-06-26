package week3

object TypeParameterExp {
  def main(args: Array[String]) = {
    val t = new Temp
    val x = t.add1("Suresh", 6)
    println(x)
  }
}

trait add[B] {
  def addM[T](a : T, b: T) : T
   
}

class Temp[B] {
  
  def add1[c](a: c, c: c) :c = a
  
}