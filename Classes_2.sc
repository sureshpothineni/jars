package week1

import scala.AnyRef

object Classes_2 {
   new Test(1,2)
}

class Test(a:Int, b:Int) extends AnyRef {

  def a1 = a
  def a2 = b

  var i = 1
  var x = new Test(1, 2)
  while (i <= 5) {
    x += new Test(1, i)
    i += 1
  }

  def testM(that: Test) = {
    var i = 1
    var x = new Test(1, 2)
    while (i <= 5) {
      //x += new Test(1, i)
      i += 1
    }
  }
}