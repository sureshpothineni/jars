package week5

import java.util._
import java.text.SimpleDateFormat

object DatesExp {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  val currentDate = Calendar.getInstance.getTime  //> currentDate  : java.util.Date = Fri Mar 10 13:44:41 EST 2017
  val minuteFormat = new SimpleDateFormat("yyyy-MM-dd")
                                                  //> minuteFormat  : java.text.SimpleDateFormat = java.text.SimpleDateFormat@f67a
                                                  //| 0200
  val dataFormatted = minuteFormat.format(currentDate)
                                                  //> dataFormatted  : String = 2017-03-10
  
}