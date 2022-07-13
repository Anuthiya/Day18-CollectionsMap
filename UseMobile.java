package trainingday18COLLECTIONSmap;

import java.util.HashMap;

public class UseMobile {
	public static void main(String args[]) {
		Mobile mobile1=new Mobile("Samsung",18000,true);
		Mobile mobile2=new Mobile("Apple",42000,false);
		Mobile mobile3=new Mobile("Vivo",15000,true);
		
		HashMap<Integer, Mobile> mobiles=new HashMap<>();
		mobiles.put(1, mobile1);
		mobiles.put(2, mobile2);
		mobiles.put(3, mobile3);
		
		int max=0;
		int min=mobiles.get(1).getPrice();
		int count=0;
		
		
		for(Integer mobilekey:mobiles.keySet()) {
			System.out.println(mobilekey);
		} 
		for(Mobile mobilevalue:mobiles.values()) {
			if(mobilevalue.getIsAndroid()==true) {
				System.out.println(mobilevalue.getBrand());
			}
		}
		
		for(Mobile mobilevalue:mobiles.values()) {
			if(max<mobilevalue.getPrice()) {
				max=mobilevalue.getPrice();
				
			}
		}
			System.out.println(max+" is highest price");
		
	    for(Mobile mobilevalue:mobiles.values()) {
	    	if(min>mobilevalue.getPrice()) {
	    		min=mobilevalue.getPrice();
	    	}
	    }
	    System.out.println(min);
	    
	    for(Mobile mobilevalue:mobiles.values()) {
	    	if(mobilevalue.getIsAndroid()==true) {
	    	count=count+1;
	    }
	    }
	   System.out.println(count);
	      
	   }
	    
	
	}

	

