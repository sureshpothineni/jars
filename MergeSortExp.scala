package week3

object MergeSortExp {
  def main(args: Array[String]) {
    def msort(xs: List[Int]): List[Int] = {
      val n = xs.length / 2
      println("xs.lenght:" + xs.length)
      println("xs:" + xs)
      println("n" + n)
      if (n == 0) xs
      else {
        def merge(xs: List[Int], ys: List[Int]): List[Int] = {
          println("merge xs" + xs)
          println("merge ys" + ys)
          (xs, ys) match {
            case (Nil, ys) => ys
            case (xs, Nil) => xs
            case (x :: xs1, y :: ys1) =>{
              println("merge x"+x)
              println("merge y"+y)
              if (x < y) x :: merge(xs1, ys)
              else y :: merge(xs, ys1)
            }
          }
        }
        val (fst, snd) = xs splitAt n
        println("fst", fst)
        println("snd", snd)
        merge(msort(fst), msort(snd))
        //merge(fst, snd)

      }

    }
    val x = List(6, -3, 4, 2)
    println(msort(x))
  }
}