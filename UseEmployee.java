package trainingday18COLLECTIONSmap;

import java.util.HashMap;
import java.util.Iterator;

public class UseEmployee {
	public static void main(String args[]) {
		Employee emp1=new Employee("Saravanan",212,28000);
		Employee emp2=new Employee("Madhu",218,32000);
		Employee emp3=new Employee("Jeeva",232,48000);
		
		HashMap<Integer, Employee> emps=new HashMap<>();
//		emps.put(101, emp1);
//		emps.put(201, emp2);
//		emps.put(301, emp3);
//		
		emps.put(emp1.getId(), emp1);
		emps.put(emp2.getId(), emp2);
		emps.put(emp3.getId(), emp3);
		
		Iterator itr=emps.values().iterator();
		while( itr.hasNext()) {
			//System.out.println(itr.next());
			Employee e=(Employee)itr.next();
			System.out.println(e);
			
			
		}
		
//		Iterator<Integer> keyItr=emps.keySet().iterator();
//		while(keyItr.hasNext()) {
//			System.out.println(keyItr.next());
//		}
//		
//	    Iterator<Employee> valItr=emps.values().iterator();
//	    while(valItr.hasNext()) {
//		Employee newobj=valItr.next();
//		if(newobj.getSalary()>30000) {
//			System.out.println(newobj);
//			
		//}
	//}
}
}
	
		
		
		
		
	


