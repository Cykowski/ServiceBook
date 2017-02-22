package service_book.vehicle;

import org.joda.time.LocalDate;

public class Wheel extends Part {
	
	public String radius;
	
	public String getRadius() {
		return radius;
	}

	public void setRadius(String radius) {
		this.radius = radius;
	}

	public Wheel()
	{
		this.radius = "R17";
		this.expireDate = LocalDate.now().plusYears(5);  
	}

	
	public Wheel(String radius)
	{
		this.radius = radius;
		this.expireDate = LocalDate.now().plusYears(5);  
	}
	
	public Wheel(String description, String name, String radius)
	{
		super(description,name);
		this.radius = radius;
		this.expireDate = LocalDate.now().plusYears(5);  
	}

	@Override
	public void showPart() {
		// TODO Auto-generated method stub
//		super.showPart();
		System.out.println("WHEEL: " + this.getName() 
					+ " Desc: " + this.getDescription() 
					+ " Radius: " + this.getRadius());
	}
	
	
}


