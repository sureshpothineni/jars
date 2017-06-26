package week1

object session2 {
	val test="Suresh"                         //> test  : String = Suresh
	var str = "suresh babu pothineni"         //> str  : String = suresh babu pothineni
	str = str.replaceAll(" ", "")
	println(str)                              //> sureshbabupothineni
	val specs = new Array[String](2)          //> specs  : Array[String] = Array(null, null)
	//require(specs.length > 3, s"Invalid parameter specifications, required: columnsFilePath,ClustersLimit and IterationCount, [comments], found ${test}")
	
	
	def factorial(n: Int) : Int =
	 if (n == 0) 1 else n * factorial(n-1)    //> factorial: (n: Int)Int
	
	factorial(4)                              //> res0: Int = 24
	
	def fact(n: Int) : Int = {
		def loop(acc: Int, n:Int): Int =
			if (n ==0) acc else loop(acc * n, n -1)
		loop(1,n)
	}                                         //> fact: (n: Int)Int
	fact(4)                                   //> res1: Int = 24
	
	def add(x:Int, y:Int) : Int = x+y         //> add: (x: Int, y: Int)Int
	
	add(4,5)                                  //> res2: Int = 9
	
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
	val keysIter = mapVal.keysIterator        //> keysIter  : Iterator[Char] = non-empty iterator
	while(keysIter.hasNext){
		val keyVal = keysIter.next()
		println(keyVal)
	}                                         //> t
                                                  //| a
                                                  //| c
}