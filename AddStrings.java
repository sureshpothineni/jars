package dynamicprogram;

import java.util.ArrayList;
import java.util.Collections;

public class AddStrings {
	static int carry;
	public static void main(String a[]){
		String str = "781";
		String str1 = "781";
		int i = str.length() -1;
		int j = str.length() -1;
		ArrayList<Integer> al = new ArrayList();
		
		int i1 =Integer.MAX_VALUE;
		int i2 =Integer.MIN_VALUE;
		System.out.println(i1+":"+i2);
		
		while (true){
			int val1 = Integer.parseInt(Character.toString(str.charAt(i)));
			int val2 = Integer.parseInt(Character.toString(str.charAt(j)));
			System.out.println("val1 "+val1 +" val2"+val2);
			int count = val1 + val2 + carry;
			
			if (count > 9){
				carry = 1;
				count = count - 10;
			} else carry =0;
			al.add(count);
			i--;
			j--;
			System.out.println("count :"+count);
			if (i <0) {
				al.add(carry);
				break;
			}
			
		}
		Collections.reverse(al);
		for (Integer integer : al) {
			System.out.print(integer);
		}
	}
}
