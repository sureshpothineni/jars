package javaexp;

public class Polymorphisam {
	public static void main(String a[]){
		//Super s = new Sub();
		//s.add1(1, 2);
		
		Super s = new Sub();
		s.add(1, 2);
		s.a=20;
		System.out.println(s.a);
	}
}

interface Sample {
	public static int a =10;
	public void add10();
}
abstract class  Sample1{
	public void add12() {}
	public void add13() {}
}
class Super extends Sample1 implements Sample{
	int a =20;
	public void add10() {
		System.out.println("add10");
	}
	public static void add(int a){
		System.out.println("Super static add");
	}
	
	public static void add(int a, int b){
		System.out.println("Super static add1");
	}

	
	public void add1(int a){
		System.out.println("Super add1");
	
	}

	public double add1(int a, int b){
		System.out.println("Super add1");
		return 1;
	} 
			
}

class Sub extends Super {
	public static void add(int a, int b){
		System.out.println("Sub static add1");
	}

	public double add1(int a, int b){
		System.out.println("Sub add1");
		return 1;
	}
	
	
	public void add10(){ }
	public int add10(int a) throws ArrayIndexOutOfBoundsException {return 1;}
	public double add10(int a, int b) throws  Exception {return 1;}
	
	
}