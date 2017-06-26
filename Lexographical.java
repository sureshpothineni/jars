package dynamicprogram;

public class Lexographical {
	final static char MAX = 26;
	public static void main(String[] args) {
		System.out.println(findPalindromicString("malayxaa"));
	}

	static void countFreq(String str, int freq[], int len)
	{
	    for (int i=0; i<len; i++)
	        freq[str.charAt(i) - 'a']++;
	}
	 
	// Cases to check whether a palindr0mic
	// String can be formed or not
	static boolean  canMakePalindrome(int freq[], int len)
	{
	    // count_odd to count no of
	    // chars with odd frequency
	    int count_odd = 0;
	    for (int i=0; i<MAX; i++)
	        if (freq[i]%2 != 0)
	            count_odd++;
	 
	    // For even length String
	    // no odd freq character
	    if (len%2 == 0)
	    {
	        if (count_odd > 0)
	            return false;
	        else
	            return true;
	    }
	 
	    // For odd length String
	    // one odd freq character
	    if (count_odd != 1)
	        return false;
	 
	    return true;
	}
	 
	// Function to find odd freq char and
	// reducing its freq by 1returns "" if odd freq
	// char is not present
	static String findOddAndRemoveItsFreq(int freq[])
	{
	    String odd_str = "";
	    for (int i=0; i<MAX; i++)
	    {
	        if (freq[i]%2 != 0)
	        {
	            freq[i]--;
	            odd_str = odd_str + (char)(i+'a');
	            return odd_str;
	        }
	    }
	    return odd_str;
	}
	static public String findPalindromicString(String str)
	{
	    int len = str.length();
	 
	    int freq[] = new int[MAX];
	    countFreq(str, freq, len);
	 
	    //if (!canMakePalindrome(freq, len))
	    //    return "No Palindromic String";
	 
	    // Assigning odd freq character if present
	    // else empty String.
	    String odd_str = findOddAndRemoveItsFreq(freq);
	 
	    String front_str = "", rear_str = " ";
	 
	    // Traverse characters in increasing order
	    for (int i=0; i<MAX; i++)
	    {
	        String temp = "";
	        if (freq[i] != 0)
	        {
	            char ch = (char)(i + 'a');
	 
	            // Divide all occurrences into two
	            // halves. Note that odd character
	            // is removed by findOddAndRemoveItsFreq()
	            for (int j=1; j<=freq[i]/2; j++)
	                temp = temp + ch;
	 
	            // creating front String
	            front_str = front_str + temp;
	 
	            // creating rear String
	            rear_str = temp + rear_str;
	        }
	    }
	 
	    // Final palindromic String which is
	    // lexicographically first
	    return (front_str + odd_str + rear_str);
	}
	// O(n^2)
	
}
