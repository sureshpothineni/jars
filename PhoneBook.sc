package week1
import scala.io.Source


object PhoneBook {
  
  val mnem = Map('2'->"ABC",('3',"DEF"),'4'->"GHI",'5'->"JKL",'6'->"MNO",'7'->"PQRS"
  ,'8'->"TUV",'9'->"WXYZ")                        //> mnem  : scala.collection.immutable.Map[Char,String] = Map(8 -> TUV, 4 -> GHI
                                                  //| , 9 -> WXYZ, 5 -> JKL, 6 -> MNO, 2 -> ABC, 7 -> PQRS, 3 -> DEF)
  
 val charCode:Map[Char,Char] =for((digit,str) <- mnem;ltr<-str) yield ltr->digit
                                                  //> charCode  : Map[Char,Char] = Map(E -> 3, X -> 9, N -> 6, T -> 8, Y -> 9, J -
                                                  //| > 5, U -> 8, F -> 3, A -> 2, M -> 6, I -> 4, G -> 4, V -> 8, Q -> 7, L -> 5,
                                                  //|  B -> 2, P -> 7, C -> 2, H -> 4, W -> 9, K -> 5, R -> 7, O -> 6, D -> 3, Z -
                                                  //| > 9, S -> 7)

def wordCode(word:String):String = word.toUpperCase map charCode
                                                  //> wordCode: (word: String)String

wordCode("Java")                                  //> res0: String = 5282
wordCode("ScaLA")                                 //> res1: String = 72252

//"5282" -> List("Kata","Lava","Java")
//"1111" ->List()

  val in = Source.fromFile("C:\\Users\\pl24116\\Desktop\\Learning\\Sca\\coursera\\week6\\linuxwords.txt")
                                                  //> java.io.FileNotFoundException: C:\Users\pl24116\Desktop\Learning\Sca\courser
                                                  //| a\week6\linuxwords.txt (The system cannot find the path specified)
                                                  //| 	at java.io.FileInputStream.open0(Native Method)
                                                  //| 	at java.io.FileInputStream.open(Unknown Source)
                                                  //| 	at java.io.FileInputStream.<init>(Unknown Source)
                                                  //| 	at scala.io.Source$.fromFile(Source.scala:91)
                                                  //| 	at scala.io.Source$.fromFile(Source.scala:76)
                                                  //| 	at scala.io.Source$.fromFile(Source.scala:54)
                                                  //| 	at week1.PhoneBook$$anonfun$main$1.apply$mcV$sp(week1.PhoneBook.scala:20
                                                  //| )
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$$anonfun$$exe
                                                  //| cute$1.apply$mcV$sp(WorksheetSupport.scala:76)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.redirected(W
                                                  //| orksheetSupport.scala:65)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.$execute(Wor
                                                  //| ksheetSupport.scala:75)
                                                  //| 	at week1.PhoneBook$.main(week1.PhoneBook.scala:5)
                                                  //| 	at week1.PhoneBook.main(week1.Phone
                                                  //| Output exceeds cutoff limit.
  
  val words = in.getLines.toList filter(word=>word forall(x=>x.isLetter))

val wordsForNum: Map[String,Seq[String]] =
//words map(x=>x) groupBy wordCode withDefaultValue Seq()
words groupBy wordCode withDefaultValue Seq()
//encode("7223247386")

def encode(number: String): Set[List[String]] = {
if (number.isEmpty) Set(List())
else {
for {
split<-1 to number.length
word<-wordsForNum(number take split)
rest<-encode(number drop split)
}
yield word::rest
}.toSet
}

encode("8486674468")
encode("7225247386")
//("Scala"::"for"::"fun"::List()).toSet

def translate(number:String): Set[String] =
encode(number) map (_ mkString " ")

translate("8486674468")
translate("7225247386")
                                              

}