package week4



object InsertionSort {
  
  def iSort(xs: List[Int]) : List[Int] = {
    xs match {
      case List() => List()
      case x :: xs1 => intSort(x, xs1)
    }
  }
  
  def intSort(x: Int, xs: List[Int]) : List[Int] = {
    xs match {
      case List() => xs
      case y :: ys => if (x <= y) x :: xs else y :: intSort(x, ys)
    }
  }
  
  
}