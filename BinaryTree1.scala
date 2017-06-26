package week1

object BinaryTree1 {
  def main(args : Array[String]) {
    val x = new NonEmptyTree(3, new EmptyTree, new EmptyTree)
    //println(x.contains(5))
    //val y = new NonEmptyTree(3, new EmptyTree, new EmptyTree)
    val x1= x include 4
    //val x2= x.include(7)
    println(x1)
  }
}

trait AllTree {
  def contains(x: Int) : Boolean
  def include(x: Int) : AllTree
}

class EmptyTree extends AllTree{
  def contains(x: Int) = false
  def include(x: Int) : AllTree = new NonEmptyTree(x, new EmptyTree, new EmptyTree)
  override def toString = "."
}

class NonEmptyTree(ele: Int, left: AllTree, right: AllTree) extends AllTree{
  def contains(x: Int) =
    if(x < ele) left contains x
    else if (x > ele) right contains x
    else true
    
  def include(x: Int) =
    if(x < ele) new NonEmptyTree(x, left include x, right)
    else if(x > ele) new NonEmptyTree(x, left, right include x)
    else this
    
  override def toString = "{"+left+ele+right+"}"
}