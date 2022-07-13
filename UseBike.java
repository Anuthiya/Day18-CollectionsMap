package trainingday18COLLECTIONSmap;

import java.util.HashMap;

public class UseBike {
	public static void main(String args[]) {
		Bike bike1=new Bike("HeroHonda",85000,150);
		Bike bike2=new Bike("TVS",92000,220);
		Bike bike3=new Bike("BAJAJ",78000,180);
		
		HashMap<Integer, Bike> bikes=new HashMap();
		bikes.put(1,bike1);
		bikes.put(2,bike2);
		bikes.put(3,bike3);
		
		bikes.forEach((key,value) -> System.out.println(key+" "+value));
		
		//bikes.forEach((key, value) -> {
			//if(value.getPrice()<80000) {
				//System.out.println(value.getBrand());
			//}
		//});
		
	}

}
