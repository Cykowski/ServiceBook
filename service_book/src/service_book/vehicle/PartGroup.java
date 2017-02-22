package service_book.vehicle;

import java.util.LinkedList;

public class PartGroup {

	public LinkedList<Part> parts = new LinkedList<Part>();
	
	
	
	public void addPart(String description, String name){
		parts.add(new Part(description,name));
	}
	
	public void addWheel(String description, String name, String radius){
		if (!description.isEmpty())
			parts.add(new Wheel(description, name, radius));
		else
			if (!radius.isEmpty())
				parts.add(new Wheel(radius));
			else
				parts.add(new Wheel());
			
	}
	
	public void showAllParts(){
		for (Part part : parts) {
			part.showPart();
		}
	}
}
