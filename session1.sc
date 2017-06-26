package week1

object session1 {
  //val x: Double = 1.2

  def abs(x: Double) = if (x <= 0) -x else x      //> abs: (x: Double)Double

  def sqrt(x: Double)  {
    def sqrtIter(guess: Double): Double = {
      println(guess + " " + x)
      if (isGoodEnough(guess)) guess
      else sqrtIter(improve(guess))
    }
    def isGoodEnough(guess: Double) = {
      println("G :" + guess * guess)
      println("G :" + (guess * guess - x))
      println("G :" + abs(guess * guess - x))
      abs(guess * guess - x) < 0.01
    }
    def improve(guess: Double) = {
      println("i :", guess + x)
      println("i :", guess + x / guess)
      println(("i :", (guess + x / guess) / 2))

      (guess + x / guess) / 2
    }
    
    sqrtIter(x)

  }                                               //> sqrt: (x: Double)Unit

  //0.0001, 0.1e-20, 1.0e20, 1.0e50
  sqrt(5)                                         //> 5.0 5.0
                                                  //| G :25.0
                                                  //| G :20.0
                                                  //| G :20.0
                                                  //| (i :,10.0)
                                                  //| (i :,6.0)
                                                  //| (i :,3.0)
                                                  //| 3.0 5.0
                                                  //| G :9.0
                                                  //| G :4.0
                                                  //| G :4.0
                                                  //| (i :,8.0)
                                                  //| (i :,4.666666666666667)
                                                  //| (i :,2.3333333333333335)
                                                  //| 2.3333333333333335 5.0
                                                  //| G :5.4444444444444455
                                                  //| G :0.44444444444444553
                                                  //| G :0.44444444444444553
                                                  //| (i :,7.333333333333334)
                                                  //| (i :,4.476190476190476)
                                                  //| (i :,2.238095238095238)
                                                  //| 2.238095238095238 5.0
                                                  //| G :5.009070294784581
                                                  //| G :0.009070294784581101
                                                  //| G :0.009070294784581101
  

}