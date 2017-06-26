package week5

object maps {
  val m = Map(1 -> 5, 1 -> null, 4 -> 5)          //> m  : scala.collection.immutable.Map[Int,Any] = Map(1 -> null, 4 -> 5)
  val it = m.keys                                 //> it  : Iterable[Int] = Set(1, 4)
  val keysSet = m.keySet                          //> keysSet  : scala.collection.immutable.Set[Int] = Set(1, 4)

  it.foreach { x => val value = m.get(x); println(value.toList) }
                                                  //> List(null)
                                                  //| List(5)
  class temp(a: List[Int]) {
  	def this(x: Int*) = this(x.toList)
  	val x1 = a
  	
    def sorting(a: List[Int]) {
      println(a.sorted)
       
    }
  }
  
  val x = new temp(4,6,2,9)                       //> x  : week5.maps.temp = week5.maps$$anonfun$main$1$temp$1@4de8b406
  x.sorting(x.x1)                                 //> List(2, 4, 6, 9)
  
  val s = "Suresh Babu"                           //> s  : String = Suresh Babu
  s.split(" ")                                    //> res0: Array[String] = Array(Suresh, Babu)
  
  
}