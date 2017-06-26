package dynamicprogram;

//Maximum sum such that no two elements are adjacent

// Input : arr[] = {5, 5, 10, 100, 10, 5}
// Output : 110

public class MaximumSum {
	public static void main(String args[]) {
		int a[] = {5,5,10, 100, 10, 5};
		
		int incl = a[0];
		int count = 0;
		int j = 0;
		
		for(int i=1; i<a.length-1;i++){
			j = (incl > count) ? incl : count;
			incl = count + a[i];
			count = j;
		}
		
		System.out.println(count);
	}
}
