package week1

import java.util.NoSuchElementException

object BinaryTree {
  
    val array: Array[NonEmptySet] = Array()

}

trait IntSet{
  def include(x : Int) : IntSet
  def contains(x: Int) : Boolean
}

class EmptySet extends IntSet{
  def contains(x:Int) : Boolean = false
  def include(x:Int) : IntSet = new NonEmptySet(x, new EmptySet, new EmptySet)
}

class NonEmptySet(ele :Int, left: IntSet, right: IntSet) extends IntSet {
  def contains(x: Int) : Boolean = {
    if (x < ele) left contains x 
    else if (x > ele) right contains x
    else true
  }
  
  def include(x:Int) : IntSet = {
    if (x < ele) new NonEmptySet(x, left include x, right)
    else if (x > ele) new NonEmptySet(x, left, right include x)
    else this
  }
}