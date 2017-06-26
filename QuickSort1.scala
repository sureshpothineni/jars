package algorithms

object QuickSort1 {
  def main(args: Array[String]) {
    def sort(xs: Array[Int]) {
      def swap(i: Int, j: Int) {
        val t = xs(i); xs(i) = xs(j); xs(j) = t
        println(xs.foreach(print))
      }
      def sort1(l: Int, r: Int) {
        val pivot = xs((l + r) / 2)
        var i = l; var j = r
        println("pivot ="+pivot+": i="+i+": j="+j)
        while (i <= j) {
          while (xs(i) < pivot) { println("xs(i)"+xs(i));i += 1 }
          println("1 pivot ="+pivot+": i="+i)
          println("xs(j) :"+xs(j)+": pivot="+pivot)
          while (xs(j) > pivot)  { println("xs(j)"+xs(j));j -= 1}
          println("1 pivot ="+pivot+": i="+i+": j="+j+": i <= j="+(i <= j))
          if (i <= j) {
            println("swap i="+i+": j="+j)
            swap(i, j)
            i += 1
            j -= 1
            println("swap1 i="+i+": j="+j)
          }
        }
        xs.foreach(print)
        println(" ")
        if (l < j) { println("Before Sort1 called");sort1(l, j) }
        if (j < r) {println("Before Sort2 called");sort1(i, r)}
        println("2 sorts are completed")
      }
      sort1(0, xs.length - 1)
      println(xs.foreach(print))
    }
    val l = Array(5,2,8,1,9,4)
    println(sort(l))
    
    
     def sortString(xs: Array[Char]) {
      def swap(i: Int, j: Int) {
        val t = xs(i); xs(i) = xs(j); xs(j) = t
        println(xs.foreach(print))
      }
      def sort1(l: Int, r: Int) {
        val pivot = xs((l + r) / 2)
        var i = l; var j = r
        println("pivot ="+pivot+": i="+i+": j="+j)
        while (i <= j) {
          while (xs(i) < pivot) { println("xs(i)"+xs(i));i += 1 }
          println("1 pivot ="+pivot+": i="+i)
          println("xs(j) :"+xs(j)+": pivot="+pivot)
          while (xs(j) > pivot)  { println("xs(j)"+xs(j));j -= 1}
          println("1 pivot ="+pivot+": i="+i+": j="+j+": i <= j="+(i <= j))
          if (i <= j) {
            println("swap i="+i+": j="+j)
            swap(i, j)
            i += 1
            j -= 1
            println("swap1 i="+i+": j="+j)
          }
        }
        xs.foreach(print)
        println(" ")
        if (l < j) { println("Before Sort1 called");sort1(l, j) }
        if (j < r) {println("Before Sort2 called");sort1(i, r)}
        println("2 sorts are completed")
      }
      sort1(0, xs.length - 1)
      println(xs.foreach(print))
    }
    val str = "LISTEN";
    println("final :"+sortString(str.toArray));
  }
  
  
  
     def sort(xs: Array[Int]) {
      def swap(i: Int, j: Int) {
        val t = xs(i); xs(i) = xs(j); xs(j) = t
        println(xs.foreach(print))
      }
      def sort1(l: Int, r: Int) {
        val pivot = xs((l + r) / 2)
        var i = l; var j = r
        while (i <= j) {
          while (xs(i) < pivot) { println("xs(i)"+xs(i));i += 1 }
          while (xs(j) > pivot)  { println("xs(j)"+xs(j));j -= 1}
          if (i <= j) {
            swap(i, j)
            i += 1
            j -= 1
          }
        }
        xs.foreach(print)
        println(" ")
        if (l < j) sort1(l, j) 
        if (j < r) sort1(i, r)
      }
      sort1(0, xs.length - 1)
    }
    val l = Array(5,2,8,1,9,4)
    println(sort(l))
  
  
  
  
}