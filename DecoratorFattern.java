package designpatterns;

interface Icecream {
	public String makeIcecream();
}

class SimpleIceCream implements Icecream {
	public String makeIcecream() {
		System.out.println("Simple Ice Cream");
		return "Simple Ice Cream";
	}
}

abstract class IcecreamDecorator implements Icecream {

	  protected Icecream specialIcecream;

	  public IcecreamDecorator(Icecream specialIcecream) {
	    this.specialIcecream = specialIcecream;
	  }

	  public String makeIcecream() {
	    return specialIcecream.makeIcecream();
	  }
}

class HoneyDecorator extends IcecreamDecorator{
	
	public HoneyDecorator(Icecream specialIcecream) {
	    super(specialIcecream);
	}
	
}

public class DecoratorFattern {

}
