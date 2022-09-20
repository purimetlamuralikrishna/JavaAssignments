package murali.practise;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.List;

public class Practise1 {
	
	
	public void printCity(City city){
		if(city != null){
		System.out.println("our service is available ");
		city.message();
		System.out.println(city.numberofTowers);
		}
		else
		System.out.println("invalid city");
		}

	public static void main(String[] args) {
		
		Map<Integer,String> hm = new HashMap<>();
		hm.put(1,"one");
		hm.put(2,"two");
		hm.put(3,"three");
		hm.put(4,"four");
		hm.put(5,"five");
		System.out.println("Getting all the keys");
		Set<Integer> keys = hm.keySet();
		for(Integer x:keys){
		System.out.println(x);
		}
		System.out.println("=================");
		System.out.println("Getting all the values");
		Collection<String> values= hm.values();
		for(String value:values){
		System.out.println(value);
		}
		System.out.println("=================");
		
		
		System.out.println("Getting both key and values");
		
		
		
		Set<Map.Entry<Integer,String>> keyValue= hm.entrySet();
		
		List<Map.Entry<Integer,String>> l1 = new LinkedList<Entry<Integer,String>>(hm.entrySet());
		
		System.out.println(l1);
		
		Collections.sort(l1,(o1,o2)-> o1.getValue().compareTo(o2.getValue()));
		
		System.out.println(l1);
		 
		for(Map.Entry<Integer,String> me: keyValue){
		System.out.println(me.getKey()+"======"+me.getValue());
		//System.out.println(me);
		
		
		Practise1 m1=new Practise1();
		m1.printCity(City.CHENNAI);
		m1.printCity(City.MUMBAI);
		
		}
		
		

}
}
