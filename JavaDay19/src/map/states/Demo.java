package map.states;

import java.util.LinkedHashMap;
import java.util.Map;

public class Demo {

	public static void main(String[] args) {
		
		Map<String,String>  stateCaptials = new LinkedHashMap<>();
		
		stateCaptials.put("Telangana","Hyderabad");
		stateCaptials.put("Karnatak","Bangalore");
		stateCaptials.put("Tamilanadu","Chennai");
		stateCaptials.put("Kerala","Cochi");
		stateCaptials.put("Delhi","Delhi");
		stateCaptials.put("Maharastra","Mumbai");
		
		
		for(Map.Entry<String,String> list : stateCaptials.entrySet()) {
			
			System.out.println(list.getKey()+"  --->>>  "+list.getValue());
			
		}
		
		System.out.println(stateCaptials);
		

	}

}
