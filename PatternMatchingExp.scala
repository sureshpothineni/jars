package week1

object PatternMatchingExp {
  def main(args: Array[String]) {
    def test(x: String) = x match {
      case ("9")  => "Test1"
      case ("10") => "Test2"
    }
    val x = test("10")
    println(x)
  }
}