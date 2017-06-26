package algorithms;

public class QuickSort {
	   int partition(int arr[], int low, int high)
	    {
	        int pivot = arr[high]; 
	        int i = (low-1); // index of smaller element
	        System.out.println("low="+low+": high="+high+": i="+i+": Spivot="+pivot);

	        for (int j=low; j<=high-1; j++)
	        {
	            // If current element is smaller than or
	            // equal to pivot
	            if (arr[j] <= pivot)
	            {
	                i++;
	 
	                // swap arr[i] and arr[j]
	                int temp = arr[i];
	                arr[i] = arr[j];
	                arr[j] = temp;
	                System.out.println("Found less value");
	            }
	        }
	        System.out.println("Partition :");
	        for (int j = 0; j < arr.length; j++) {
				System.out.print(" "+arr[j]);
			}
	        // swap arr[i+1] and arr[high] (or pivot)
	        System.out.println(" ");
	        int temp = arr[i+1];
	        arr[i+1] = arr[high];
	        arr[high] = temp;
	        for (int j = 0; j < arr.length; j++) {
				System.out.print(" "+arr[j]);
			}
	        System.out.println(" ");
	        return i+1;
	    }
	 
	 
	    /* The main function that implements QuickSort()
	      arr[] --> Array to be sorted,
	      low  --> Starting index,
	      high  --> Ending index */
	    void sort(int arr[], int low, int high)
	    {
	        if (low < high)
	        {
	            /* pi is partitioning index, arr[pi] is 
	              now at right place */
	            System.out.println("Sort low="+low+": high="+high);
	            int pi = partition(arr, low, high);
	            System.out.println("Sort1 low="+low+": high="+high+": pi="+pi);
	            // Recursively sort elements before
	            // partition and after partition
	            //sort(arr, low, pi-1);
	            sort(arr, pi+1, high);
	        }
	        
	    }
	 
	    // Driver program
	    public static void main(String args[])
	    {
	        int arr[] = {10, 7, 8, 9, 1, 5};
	        int n = arr.length;
	 
	        QuickSort ob = new QuickSort();
	        ob.sort(arr, 0, n-1);
	 
	        System.out.println("sorted array");
	        for (int j = 0; j < arr.length; j++) {
				System.out.print(" "+arr[j]);
			}
	    }
}
