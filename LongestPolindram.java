package dynamicprogram;

public class LongestPolindram {

	public static String longest(String str){
		if (str.isEmpty()) {
			return null;
		}
		
		if (str.length() == 1) {
			return str;
		}
		String longest = str.substring(0,1);
		
		for(int i=0; i< str.length();i++){
			String tmp = helper(str, i, i);
			if (tmp.length() > longest.length()) {
				longest = tmp;
			}

			// get longest palindrome with center of i, i+1
			tmp = helper(str, i, i + 1);
			if (tmp.length() > longest.length()) {
				longest = tmp;
			}
		}
		
		return longest;
	}
	
	static String helper(String str, int begin, int end){
		while (begin >= 0 && end <= str.length() - 1 && str.charAt(begin) == str.charAt(end)) {
			begin--;
			end++;
		}
		return str.substring(begin+1, end);
	}
	
	public static void main(String arg[]){
		String str = "abcdaf";
		System.out.println(longest(str));
		System.out.println(str.substring(str.indexOf('g'), str.indexOf('k')));
	}
}
