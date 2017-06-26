package week1

object ListTypeExp {
  def main(args: Array[String]) {
    val f1 = new Function3[Int, Int, Int, Int] {
      def apply(x: Int, x1: Int, x3: Int) = x + x1 + x3
    }
    val x = f1.apply(1, 2, 3)
    println(x)
    //def singleTon(ele: String) = new Cons(1, new Cons(2, new Nil))
    //singleTon("10")
    val x1: AList[Any] = Nil
    def f(xs: AList[NonEmptySet], x: AList[EmptySet]) = xs prepend x
    
    val s: String = "Suresh"
  }

}
trait AList[+T] {
  def isEmpty: Boolean
  def head: T
  def tail: AList[T]
  def prepend[U >: T](ele: U) : AList[U] = new Cons(ele, this)
  //def function[U](f:  T => U) : U 
}

class Cons[T](val head: T, val tail: AList[T]) extends AList[T] {
  def isEmpty = false
  override def toString() = "{" + head + tail.head + "}"
}

/*class Nil[T] extends List[T] {
  def isEmpty = true
  def head: Nothing = throw new NoSuchElementException("No Element found")
  def tail: Nothing = throw new NoSuchElementException("No Element Found")
}*/

object Nil extends AList[Nothing] {
  def isEmpty = true
  def head: Nothing = throw new NoSuchElementException("No Element found")
  def tail: Nothing = throw new NoSuchElementException("No Element Found")
}