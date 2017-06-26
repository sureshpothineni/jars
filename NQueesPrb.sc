package week5

object NQueesPrb {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
	def queens(n : Int) : Set[List[Int]] ={
		def nQueen ( k : Int) : Set[List[Int]] =
			if (k==0) Set(List())
			else for {
				queens <- nQueen(k-1)
				col <- 0 to n
				if isSafe(col, queens)
			} yield col :: queens
			
		nQueen(n)
	}                                         //> queens: (n: Int)Set[List[Int]]
	
	def isSafe(col : Int, queens: List[Int]) : Boolean ={
		val row = queens.length
		val queensWithRow = (row -1 to 0 by -1) zip queens
		queensWithRow.forall{
			case (r,c) => col != c && Math.abs(col -c) != row - r
		}
	}                                         //> isSafe: (col: Int, queens: List[Int])Boolean
  
}