package week3

object StackExp {
  def main(args: Array[String]) = {
    //val x1 = new NonEmptyStack(Nothing, new EmptyStack)
    //val y = x1.push(1).push(2)

    //val x2 = new NonEmptyStack[String]
    //val y1 = x2.push("S")

    //println(y.pop.top)
    
  }
}

abstract class Stack[A] {
  def push(x: A): Stack[A] = new NonEmptyStack[A](x, this)
  def isEmpty: Boolean
  def top: A
  def pop: Stack[A]
}

object EmptyStack extends Stack[Nothing] {
  def isEmpty = true
  def top = sys.error("EmptyStack.top")
  def pop = sys.error("EmptyStack.pop")
}

class NonEmptyStack[A](elem: A, rest: Stack[A]) extends Stack[A] {
  def isEmpty = false
  def top = elem
  def pop = rest
}