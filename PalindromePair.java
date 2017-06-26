package dynamicprogram;

public class PalindromePair {
	public static void main(String arg[]){
		String str[] = {"geekf", "geeks", "or","keeg", "abc", "bc"};
		
		for(int i=0; i < str.length-1; i++){
			for (int j = i+1; j< str.length; j++ ){
				String concat = "";
				concat = concat + str[i] + str[j];
				if(isPolindram(concat)) {
					System.out.println("YES");
					break;
				}
				
			}
		}
	}
	
	public static boolean isPolindram(String str){
		
		int len = str.length();
		for(int i=0; i< len/2;i++){
			if(str.charAt(i) != str.charAt(len-i-1))
				return false;
		}
		return true;
	}
}
