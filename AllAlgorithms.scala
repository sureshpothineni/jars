package algorithms

object AllAlgorithms {
  
  // Binary Search.
  def binarySearch(n: Int, values: List[Int]) {
    def search(length : Int, values1 : List[Int]) : Option[Int] ={
      values1 match {
        case head :: tail if (n == head) => Some(head)
        case xs =>
          val (fst, snd) = values1 splitAt n
          if (values1(length) > n) 
            search(fst.length/2, fst)
          else 
            search(snd.length/2 , snd)
      }
    }
    val length = values.length/2
    search(length, values)
  }
  
  // Interpolation Search
  def interpolationSearch(toFind : Int, values: Array[Int]) : Int ={
      var mid = 0;
      var low = 0;
      var high = values.length
      while(values(low) < toFind && values(high) > toFind){
        mid = low + ((toFind - values(mid)) * (high-low))  / (high - low)
        
        if (values(mid) < toFind)
          low +=1
        else if (values(mid) > toFind)
          high-=1
        else 
          mid
      }
      low
  }
  
  // Quick Sort
  def quickSort(toFind : Int, values: Array[Int]){
    def sort(l: Int, r: Int){
      var i = l;
      var j = r;
      var pivot = values(l+r/2)
      while (i <=j) {
        while (values(i) < pivot) i+=1
        while (values(j) > pivot) j-=1
        
        if (i <= j){
          var a = values(i)
          values(i) = values(j)
          values(j) = a
          i +=1
          j -=1
        }
      }
      if(l < j) sort(l,j)
      if(j > r) sort(i, r)
    }
    sort(0, values.length)
  }
  
  //merge Sort
  def mergeSort(xs : List[Int]) : List[Int] ={
    val n = xs.length/2
    if (n ==0) List() else {
      def mSort(xs : List[Int], ys: List[Int]) : List[Int] ={
         (xs, ys) match {
           case (Nil, ys) => ys
           case (xs, Nil) => xs
           case (x:: xs1, y:: ys1) =>
             if (x < y) x :: mSort(xs1, ys) else
               y :: mSort(xs, ys1)
         }
      }
      val (fst, snd) = xs splitAt n
      mSort(mergeSort(fst), mergeSort(snd))
    }
  }
}