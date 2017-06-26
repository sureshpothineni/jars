package dynamicprogram;

public class StringRoatating {
	public static void main(String arg[]){
		String string1 = "amazon";
		String string2 = "azonam";
		int len = string2.length();

		String clock_rot = "";
	    String anticlock_rot = "";
	 
	    // Initialize string as anti-clockwise rotation
	    anticlock_rot = anticlock_rot +string2.substring(3, len) +string2.substring(0, len-2) ;
	    
	    System.out.println(anticlock_rot);
	    System.out.println(string2.substring(2));
	    
		System.out.println(string2.substring(2) + string2.substring(0, 2));

		System.out.println(string1.compareTo(anticlock_rot));

	}
}
