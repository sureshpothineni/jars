package week5

import java.util.Calendar
import java.text.SimpleDateFormat

object TestingCalender {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
    val cal : Calendar = Calendar.getInstance     //> cal  : java.util.Calendar = java.util.GregorianCalendar[time=1495821758009,a
                                                  //| reFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.Zo
                                                  //| neInfo[id="America/New_York",offset=-18000000,dstSavings=3600000,useDaylight
                                                  //| =true,transitions=235,lastRule=java.util.SimpleTimeZone[id=America/New_York,
                                                  //| offset=-18000000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3
                                                  //| ,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,
                                                  //| endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]
                                                  //| ],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2017,MONTH=4,WEEK_OF_
                                                  //| YEAR=21,WEEK_OF_MONTH=4,DAY_OF_MONTH=26,DAY_OF_YEAR=146,DAY_OF_WEEK=6,DAY_OF
                                                  //| _WEEK_IN_MONTH=4,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=2,SECOND=38,MILLISECON
                                                  //| D=9,ZONE_OFFSET=-18000000,DST_OFFSET=3600000]
    val dateFormat : SimpleDateFormat = new SimpleDateFormat("yyyy-MM-dd")
                                                  //> dateFormat  : java.text.SimpleDateFormat = java.text.SimpleDateFormat@f67a02
                                                  //| 00
    val dateKey = dateFormat.format(cal.getTime)  //> dateKey  : String = 2017-05-26
  
}