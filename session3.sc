package week1


object session3 {

	println("Suresh")                         //> Suresh
	
	val str1 = "actt"                         //> str1  : String = actt
	var mapVal = str1.groupBy(x => x).map {case (x,y) => (x, y.length())}
                                                  //> mapVal  : scala.collection.immutable.Map[Char,Int] = Map(t -> 2, a -> 1, c -
                                                  //| > 1)
  val iter1 = mapVal.valuesIterator               //> iter1  : Iterator[Int] = non-empty iterator
  var totalVal = ""                               //> totalVal  : String = ""
  while(iter1.hasNext) {
  	totalVal += iter1.next
  	
  }
  println(totalVal)                               //> 211
   
  for(iter <- mapVal.iterator)
  	println(iter._2)                          //> 2
                                                  //| 1
                                                  //| 1
  val a1 = Array[Char](26)                        //> a1  : Array[Char] = Array()
  
  val keysIter = mapVal.keysIterator              //> keysIter  : Iterator[Char] = non-empty iterator
  while(keysIter.hasNext){
  	val keyVal = keysIter.next()
  	println(keyVal - 'a')
  }                                               //> 19
                                                  //| 0
                                                  //| 2
}