package week3

import scala.math.Ordering

object MergeSortGenericsExp {
  def main(args: Array[String]) {
    def msort[T](xs: List[T])(lt: (T, T) => Boolean): List[T] = {
      val n = xs.length / 2
      println("xs.lenght:" + xs.length)
      println("xs:" + xs)
      println("n" + n)
      if (n == 0) xs
      else {
        def merge(xs: List[T], ys: List[T]): List[T] = {
          println("merge xs" + xs)
          println("merge ys" + ys)
          (xs, ys) match {
            case (Nil, ys) => ys
            case (xs, Nil) => xs
            case (x :: xs1, y :: ys1) =>{
              println("merge x"+x)
              println("merge y"+y)
              if (lt(x,y)) x :: merge(xs1, ys)
              else y :: merge(xs, ys1)
            }
          }
        }
        val (fst, snd) = xs splitAt n
        println("fst", fst)
        println("snd", snd)
        merge(msort(fst)(lt), msort(snd)(lt))
      }

    }
    val x = List(6, -3, 2, 4)
    msort(x)((x,y) => x < y)
  }
}