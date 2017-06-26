package dynamicprogram;

import java.util.Arrays;
import java.util.Collections;

public class StringAnagrams {
	public static void main(String arg[]){
		String str = "TRIANGLE";
		String str1 = "INTEGRAL";
		
		char[] charArray = str.toCharArray();
		char[] charArray1 = str1.toCharArray();

				
		Arrays.sort(charArray);
		Arrays.sort(charArray1);
		String sortedString = new String(charArray);
		String sortedString1 = new String(charArray1);

		System.out.println(sortedString);
		System.out.println(sortedString1);
		
		boolean isAnagram = true;
		for (int i = 0; i < sortedString.length();  i++)
		       if (sortedString.charAt(i) != sortedString1.charAt(i))
		    	   isAnagram = false;
		System.out.println(isAnagram);
	}
}
