package dynamicprogram;

public class LargestWordFromGiven {
	public static void main(String arg[]){
		String str[] = {"ale", "apple", "monkey", "plea"};
		String str2= "abpcplea";
		String result = "";
		int length = 0;
		for (String str1 : str) {
			if(length < str1.length() && isMatchFound(str1, str2)){
				result = str1;
				length = str.length;
				System.out.println(str1);
			}
		}
		System.out.println(result);
	}
	public static boolean isMatchFound(String str1, String str2){
		int i= str1.length();
		int j= str2.length();
		int k =0;
		
		for (int a=0; a < j && k<i; a++){
			if(str1.charAt(k) == str2.charAt(a))
				k++;
		}
		return (k == i);
	}
}
