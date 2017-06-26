package dynamicprogram;

public class CountOfSameSubStrings {
	public static void main(String a[]){
		String str = "abcd";
		int length = str.length();
		int res =0;
		for (int i=0;i< length ; i++){
			for (int j = 1; j <= length-i; j++){
				System.out.println(i+":"+j);
				if(isSubStringSame(str.substring(i, j)))
					res+=1;
			}
		}
		System.out.println(res);
	}
	public static boolean isSubStringSame(String str){
		System.out.println(str.charAt(0));
		System.out.println(str.charAt(str.length()-1));
		boolean b= str.charAt(0) == str.charAt(str.length()-1);
		System.out.println(b);
		return b;
	}
}
