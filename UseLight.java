package trainingday18COLLECTIONSmap;

import java.util.HashMap;

public class UseLight {
	public static void main(String args[]) {
		Light light1=new Light("Havdes",290,"White");
		Light light2=new Light("Philips",220,"Yellow");
		Light light3=new Light("Orient",270,"Red");
		
		HashMap<Integer, Light> lights=new HashMap<>();
		lights.put(10,light1);
		lights.put(20,light2);
		lights.put(30, light3);
		//System.out.println(lights);
		for(Integer lightkey:lights.keySet()) {
			System.out.println(lightkey);
		}
		for(Light lightvalue:lights.values()) {
			System.out.println(lightvalue);
		}
	}

}
