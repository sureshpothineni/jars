package week4

import math.Ordering

object MergeSort {
  def main(args: Array[String]) {
    // Merge Soft for Integers
    def msort(xs : List[Int]) : List[Int] = {
      val splitAtIndex = xs.length/2
      if (splitAtIndex == 0) xs else {
        def mergeSort(xs: List[Int], ys: List[Int]) : List[Int] ={
          (xs,ys) match {
            case (Nil, ys) => ys
            case (xs, Nil) => xs
            case (x :: xs1, y:: ys1) => if (x < y) x :: mergeSort(xs1, ys) else y :: mergeSort(xs, ys1)
          }
        }
        val (fst, snd) = xs splitAt splitAtIndex
        mergeSort(msort(fst), msort(snd))
      }
    }
    val l = List(5,-9,4,1)
    println(msort(l))
    
    //Merge Sort for orbitary Function
    def msort1[T](xs : List[T])(lt: (T, T) => Boolean) : List[T] = {
      val splitAtIndex = xs.length/2
      if (splitAtIndex == 0) xs else {
        def mergeSort1(xs: List[T], ys: List[T]) : List[T] ={
          (xs,ys) match {
            case (Nil, ys) => ys
            case (xs, Nil) => xs
            case (x :: xs1, y:: ys1) => if (lt(x,y)) x :: mergeSort1(xs1, ys) else y :: mergeSort1(xs, ys1)
          }
        }
        val (fst, snd) = xs splitAt splitAtIndex
        mergeSort1(msort1(fst)(lt), msort1(snd)(lt))
      }
    }
    val l1 = List(5,-9,4,1)
    println(msort1(l1)((x,y) => x < y))
    val l2 = List ("apple", "pinaple","orange", "bananna")
    println(msort1(l2)((x, y) => x.compareTo(y) < 0))
  
    // By using Math Ordering
    def msort2[T](xs : List[T])(implicit ord: Ordering[T]) : List[T] = {
      val splitAtIndex = xs.length/2
      if (splitAtIndex == 0) xs else {
        def mergeSort2(xs: List[T], ys: List[T]) : List[T] ={
          (xs,ys) match {
            case (Nil, ys) => ys
            case (xs, Nil) => xs
            case (x :: xs1, y:: ys1) => if (ord.lt(x, y)) x :: mergeSort2(xs1, ys) else y :: mergeSort2(xs, ys1)
          }
        }
        val (fst, snd) = xs splitAt splitAtIndex
        mergeSort2(msort2(fst), msort2(snd))
      }
    }
    val l3 = List(5,-9,4,1)
    println(msort2(l1))
    val l4 = List ("apple", "pinaple","orange", "bananna")
    println(msort2(l2))
  }
}