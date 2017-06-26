package dynamicprogram;

public class RemoveDuplicates {
	public static void main(String arg[]) {
		String str = "156888011065";
		int j=0;
		Character[] str1 = new Character[str.length()];
		
		for(int i=1; i < str.length(); i++){
			while(str.charAt(i) == str.charAt(j) && j >=0){
				i++;
				j--;
			}
			str1[++j] = str.charAt(i);
			
		}
		for (Character character : str1) {
			System.out.println(character);
		}
		
		char ch[] = {'a','a','c','a','d','c'};
		int n = ch.length;
		for(int i=0; i< ch.length; i++){
			for(int k=i+1; k<ch.length;k++){
				if(ch[i] == ch[k]){
					ch[k] = ch[--n];
				} else {
					k++;
				}
			}
			
		}
	}
}
