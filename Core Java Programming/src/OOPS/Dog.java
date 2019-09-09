package OOPS;

public class Dog{
	private String name,bread;
	private int cost;
	Dog(String name,String bread,int cost){
		this();
		this.name=name;
		this.bread=bread;
		this.cost=cost;
	}
	Dog(){
		
		name="Jimmy";
		bread="German Shefhred";
		cost=20000;
		
	}
	String getName() {
		
		return name;
	}
	String getBread() {
		return bread;
	}
	int getCost() {
		return cost;
	}
}