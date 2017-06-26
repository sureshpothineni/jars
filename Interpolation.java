package algorithms;

import java.util.*;
public class Interpolation {
	
	public int search(int n, int[] values) {
		int low = 0;
		int high = values.length;
		int mid = 0;
		while (values[low] <= n && values[high] > n ) {
			mid = low + ((n - values[low]) * (high - low))/ (high - low);
			
			if(values[mid] < n)
				low+=1;
			else if(values[mid] > n)
				high-=1;
			else 
				return mid;
		}
		return -1;
	}
	
	public static void main(String[] args){
		
	}
}
