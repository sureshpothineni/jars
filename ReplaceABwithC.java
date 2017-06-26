package dynamicprogram;

public class ReplaceABwithC {
	public static void main(String args[]) {
		StringBuilder str = new StringBuilder("surABeshABbabu");
		
		for(int i=0;i<str.length();i++){
			if(str.charAt(i) == 'A' && str.charAt(i+1) == 'B') {
				str.setCharAt(i, 'C');
				for(int j=i+1;j<str.length()-1;j++){
					str.setCharAt(j, str.charAt(j+1));
				}
			}
		}
		System.out.println(str);
	}
}
