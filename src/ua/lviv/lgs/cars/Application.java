package ua.lviv.lgs.cars;

public class Application {

	public static void main(String[] args) {
		
		
		Car c = new Car("Renault Sandero",5,13257.28,new Handlebar(40.5,"China"),new Wheel(35,"Winter","studded"),new Cab("Hatchback",2500.0,1300.0));
		System.out.println(c);
		
	
		
	    c.changeCarMileage(24581.5);
		
		
		
		System.out.println(c);
		
		
		
		
		
		
		
		
		

	}

}
