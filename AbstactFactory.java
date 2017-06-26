package designpatterns;

interface Shape{
	public void drawShape();
}

class Circle implements Shape{
	public void drawShape() {
		System.out.println("Circle");
	}
}

class Square implements Shape{
	public void drawShape() {
		System.out.println("Circle");
	}
}

abstract class Factory {
	public abstract Shape getShape(String nameOfShpae);
}

class ShapeFactoryImpl extends Factory{
	public Shape getShape(String nameOfShape){
		if (nameOfShape.equals("Circle"))
			return new Circle();
		else 
			return new Square();
	}
}


class AbstractFactoryImpl {
	public static Factory getFactory(String nameOfFactory){
		if (nameOfFactory.equals("Shapre"))
			return new ShapeFactoryImpl();
		else
			return new ShapeFactoryImpl();
	}	
}

public class AbstactFactory {
	public static void main(String a[]){
		Factory f = AbstractFactoryImpl.getFactory("Shape");
		f.getShape("Circle");
		
	}
}
