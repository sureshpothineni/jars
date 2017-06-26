package algorithms

object BinarySearch {
  def main(args: Array[String]) {
    val l = List(1, 2, 3, 4, 5, 6)
    def search(searchVal: Int, values: List[Int]) = {
      def binarySearch(midVal: Int, values1: List[Int]): Option[Int] = {
        println("midVal :"+midVal)
        println("values1 :"+values1)
        values1 match {
          case head :: tail if (searchVal == head) => Some(head)
          case head :: Nil                         => None
          case ls =>
            val (set1st, set2nd) = ls.splitAt(midVal)
            println(set1st)
            println(set2nd)
            if (values1(midVal) > searchVal)
              binarySearch((set1st.length / 2), set1st)
            else
              binarySearch((set2nd.length / 2), set2nd)

        }
      }
      binarySearch((values.length / 2), values)
    }
    println(search(3, l))
  }


  def sort(x : List[Int]) : List[Int] = {
    var n = x.size/2
    if (n == 0)  x 
    else {
      def mSort(xs: List[Int], ys: List[Int]) : List[Int]   = {
        (xs, ys) match {
          case (Nil, ys) => ys
          case (xs, Nil) => xs
          case (x1 :: xs1, y1 :: ys1) =>
             if (x1 < y1) x1 :: mSort(xs1, ys) else
               y1 :: mSort(xs, ys1)
        }
      }
      val (xs1 , ys1 ) = x splitAt n
      mSort(sort(xs1), sort(ys1))
    }
  }
  
  def iSort(x : List[Int]) : List[Int] = {
     x match {
       case Nil => List()
       case x1 :: xs => intSort(x1, iSort(xs))
     }
  }
  def intSort(x : Int, xs: List[Int]) : List[Int] ={
    xs match {
      case y :: ys =>
        if (x < y) x :: xs
        else y :: intSort(x, ys)
    }
  }
  
  def bSearch(n : Int, values : List[Int]) = {
    def bSearch1(midVal: Int, xs : List[Int]) : Option[Int]= {
      xs match {
        case head :: tail if head == n => Some(head)
        case head :: Nil => None
        case ys =>
          val (fst, snd) = xs splitAt n
          if (xs(midVal) > n){
            bSearch1(fst.length/2, fst)
          } else {
            bSearch1(snd.length/2, fst)
          }
      }
    }
    bSearch1(values.length/2, values)
  }
  
}