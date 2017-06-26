package dynamicprogram;

public class CountOfString {
	public static void main(String arg[]){
		System.out.println(countOfString(3, 1,2));
	}
	
	public static int countOfString(int n, int bCount, int cCount){
		if(bCount <0 || cCount <0) return 0;
		if(n ==0) return 1;
		if(bCount ==0 && cCount ==0) return 1;
		System.out.println("n :"+n+"bCount :"+bCount+"cCount :"+cCount);
		int res = countOfString(n-1, bCount, cCount);
		res+= countOfString(n-1, bCount-1, cCount);
		res+= countOfString(n-1, bCount, cCount-1);
		
		return res;
	}
}
