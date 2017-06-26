package dynamicprogram;


public class SumOfSubStrings {
	public static void main(String a[]){
		String str = "1234";
		int a1[] = new int[5];
		int lenght = str.length();
		a1[0]= Integer.parseInt(Character.toString(str.charAt(0)));
		
		int result = a1[0];

		for (int i =1; i < lenght ; i++){
			int j = Integer.parseInt(Character.toString(str.charAt(i)));
			a1[i] = ((i+1) * j) + (10 * a1[i-1]);
			result += a1[i];
		}
		System.out.println(result);
	}
}
