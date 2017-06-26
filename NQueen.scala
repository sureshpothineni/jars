package week5

object NQueen {
  def main(args: Array[String]) {
    def queens(n: Int): Set[List[Int]] = {
      def placeQueens(k: Int): Set[List[Int]] =
        if (k == 0) Set(List())
        else for {
          queens <- placeQueens(k - 1)
          column <- 0 until n
          if isSafe(column, queens)
        } yield column :: queens
      placeQueens(n)
    }

    def isSafe(col: Int, queens: List[Int]): Boolean = {
      println("col :" + col)
      println("queens :"+queens)

      val row = queens.length
      val queensWithRow = (row - 1 to 0 by -1) zip queens
      println("row :"+row+": queensWithRow :"+queensWithRow)
      queensWithRow forall {
        case (r, c) => val b = col != c && math.abs(col - c) != row - r
        println("b :"+b +":col :"+col +":c :"+c )
        b
      }
    }

    println(queens(4))
  }
}