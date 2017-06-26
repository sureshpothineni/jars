package week4

object MapExp {
  def main(args: Array[String]) {
    def scaleList(xs: List[Int], factor: Int): List[Int] = {
      xs match {
        case Nil      => xs
        case x :: xs1 => x * factor :: scaleList(xs1, factor)
      }
    }
    val l = List(1,2,3)
    println(scaleList(l, 2))
    

  }
}