package designpatterns;

public class BuilderPattern {

}

interface housePlan
{
	public void setBasement();
}

class House implements housePlan{
	public void setBasement(){
		System.out.println("set Basement");
	}
}

interface HouseBuilder {
	public void constructBasement();
	public House getHouse();
}

class ApartmentBuilder implements HouseBuilder {
	
	private House house;
	
	public ApartmentBuilder(){
		this.house = new House();
	}
	
	public void constructBasement(){
		this.house.setBasement();
	}
	
	public House getHouse() {
		return this.house;
	}
}

class Engineering {
	private HouseBuilder houseBuilder;
	
	public Engineering(HouseBuilder houseBuilder){
		this.houseBuilder = houseBuilder;
	}

	public void constructHouse(){
		this.houseBuilder.constructBasement();
	}
	
	
}