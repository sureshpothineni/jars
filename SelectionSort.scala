package algorithms

object SelectionSort {
  def main(args: Array[String]) {
    val values=Array(64,25,12,22,11)
    val length = values.length
    println(length)
    for (i <- 0 to length-1) {
      var midIndex = i
      println("MidIndex :"+midIndex)
      println("values(midIndex) :"+values(midIndex))
      for (j <- i+1 until length) {
        println("j :"+j+"values(j)"+values(j)+"<"+values(midIndex)+":values(j) < values(midIndex) :"+(values(j) < values(midIndex)))
        if (values(j) < values(midIndex))
          midIndex = j
      }
      println("After MidIndex :"+midIndex)
      var temp=values(midIndex)
      println("temp :"+temp)
      values(midIndex)=values(i)
      values(i)=temp
      println(values.foreach(x => print(" "+x)))
    }
    println(values.foreach(println))
  }
}