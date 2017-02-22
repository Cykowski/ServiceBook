package service_book.vehicle;

import java.util.LinkedList;

public class Vehicle {

	public LinkedList<PartGroup> group = new LinkedList<PartGroup>();
	
//	static public void main(String[] args)
//	{
//		System.out.println("HELLO WORLD");
//	}
	
	public void addPartGroup(){
		this.group.add(new PartGroup());
	}
	

	public void showAllPartGroups(){
		int i = 1;
		
		for (PartGroup group : group) {
			System.out.println(i + ". grupa: ");
			group.showAllParts();
			i++;
			}
	}
}
