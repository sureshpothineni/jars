package week1

import scala.collection.mutable.ArrayBuffer

object CollectionExp {
  val array = new Array[String](5)
  for (i <- 1 to 2)
    array(i) = " " + i

  println(array.toList.take(10))

  case class test(x: Int, y: Int)
  test(4, 5)

  def test1(x: Boolean) = x match {
    case (_)  => "Test1"
    case (_) => "Test2"
  }
  val x = test1(true)
  println(x)

	val l = List()
	val l1 = List(1,2,3.0)
	val l2 : List[Int] = List(1,2,3)
	
}