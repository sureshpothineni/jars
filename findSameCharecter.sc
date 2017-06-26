package dynamicprogram


import java.util.StringTokenizer

import scala.collection.immutable._
import scala.collection.mutable.LinkedList

//import scala.collection.mutable.Queue

object findSameCharecter {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  def rearrange(xs : List[Char]) : List[Char] ={
  	xs match {
  		case Nil => Nil
  		case x :: xs1 => xs1 match {
  			case Nil => x :: Nil
  			case y :: ys1 =>
  				if (x == y)  { (x :: rearrange(ys1))  }
  				else
  					x :: y :: rearrange(ys1)
  		}
  	}
  }                                               //> rearrange: (xs: List[Char])List[Char]
  
  rearrange("hellol".toList)                      //> res0: List[Char] = List(h, e, l, o, l)
  
  def removeDuplicate(xs : List[Char]) : List[Char] ={
  	xs match {
  		case Nil => Nil
  		case x :: xs1 =>
  			if(xs1.contains(x)) removeDuplicate(xs1) else x :: removeDuplicate(xs1)
  	}
  }                                               //> removeDuplicate: (xs: List[Char])List[Char]
  
  removeDuplicate("hellole".toList)               //> res1: List[Char] = List(h, o, l, e)


  var mapval = "hello".groupBy(x => x).map{ case(x,y) => (x, y.length()) }
                                                  //> mapval  : scala.collection.immutable.Map[Char,Int] = Map(e -> 1, h -> 1, l -
                                                  //| > 2, o -> 1)
	
	val s = "This is suresh"                  //> s  : String = This is suresh
	s.partition(x => x == 's')._1             //> res2: String = ssss
	
	val inti = "523451342"                    //> inti  : String = 523451342
	inti.partition(x => x % 2 ==0)._1.sorted  //> res3: String = 2244
	
	val splitStrings = s.split(" ")           //> splitStrings  : Array[String] = Array(This, is, suresh)
	val builder = new StringBuilder()         //> builder  : StringBuilder = 
	println(splitStrings.length-1)            //> 2
	for (i <- 0 to splitStrings.length-1) {
		println(" i "+i +"splitStrings(i) "+splitStrings(0))
		builder.append(splitStrings(i))
	}                                         //>  i 0splitStrings(i) This
                                                  //|  i 1splitStrings(i) This
                                                  //|  i 2splitStrings(i) This
	
	println(builder.toString())               //> Thisissuresh
	
	var stack = new Stack[Char]()             //> stack  : scala.collection.immutable.Stack[Char] = Stack()
	stack = stack.push('[')
	stack = stack.push('[')
	println(stack.tail)                       //> Stack([)
	
/**	var q = Queue[Int]()
	q.enqueue(4);
	q.enqueue(5);
	q.enqueue(6);

	println(reveseQueue(q.toList))
	def reveseQueue(q : List[Int]) : List[Int] ={
		q match {
			case q1 :: qs => reveseQueue(qs) ::: List(q1)
		}
	}*/
	
	val l = LinkedList[Int](1,2,3)            //> l  : scala.collection.mutable.LinkedList[Int] = LinkedList(1, 2, 3)
	
	println(l.size)                           //> 3
	
	println(l.head)                           //> 1
	
}