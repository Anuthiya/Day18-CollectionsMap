package trainingday18COLLECTIONSmap;

import java.util.HashMap;
import java.util.Iterator;

public class UsePen {
	public static void main(String args[]) {
		Pen pen1=new Pen("Renolds",20,"Pink");
		Pen pen2=new Pen("Apsara",30,"Red");
		Pen pen3=new Pen("Ntrj",40,"Black");
		
		HashMap<Integer, Pen> pens=new HashMap<>();
		pens.put(1,pen1);
		pens.put(2,pen2);
		pens.put(3,pen3);
		int max=0;
		Iterator<Integer> penkey=pens.keySet().iterator();
		while(penkey.hasNext()) {
			System.out.println(penkey.next());
		}
		Iterator<Pen> penval=pens.values().iterator();
		while(penval.hasNext()) {
			Pen newobj=penval.next();
			if(newobj.getPrice()>max) {
				max=newobj.getPrice();
			}
		}
		System.out.println(max);
		
		pens.forEach((key,val)-> {
			if(val.getBrand().contains("a")||val.getBrand().contains("e")||val.getBrand().contains("i")||val.getBrand().contains("o")||val.getBrand().contains("u")) {
				System.out.println(val.getBrand());
			}
		
		});
		
	}
}



