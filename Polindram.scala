package dynamicprogram

import collection.mutable._

object Level1 {
    def palindrome(input:String) = input.reverse == input

    def extractPalindromes(input:String) = 
    {
        var counter = 0
        val palindromes = new ListBuffer[String]()
        while(counter < input.length)
        {
            var localCounter = 2
            while((counter + localCounter) < input.length)
            {
                println("counter:"+counter+" localCounter:"+localCounter+"palindromes:"+palindromes)
                val tempString = input.substring(counter, input.length - localCounter)
                if(palindrome(tempString)) palindromes += tempString
                localCounter += 1
            }       
            counter += 1
        }
        palindromes
    }

    def main(args:Array[String]) = {
        val input = "malayalam"
        //extractPalindromes(input).filter(_.length > 4).foreach(println)
        extractPalindromes(input).foreach(println)
    }
}