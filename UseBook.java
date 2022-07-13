package trainingday18COLLECTIONSmap;

import java.util.HashMap;

public class UseBook {
	public static void main(String args[]) {
		Book book1=new Book("HarryPotter",1000,true,250);
		Book book2=new Book("Two States",800,false,500);
		Book book3=new Book("Secret",500,false,300);
		
		HashMap<Integer,Book> bookMap=new HashMap<>();
		bookMap.put(1,book1);
		bookMap.put(2,book2);
		bookMap.put(3,book3);
		
		System.out.println(bookMap);
		System.out.println(bookMap.get(2));
		System.out.println(bookMap.size());
		
		
	}

}
