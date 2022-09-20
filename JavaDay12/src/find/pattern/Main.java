package find.pattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) {
		
		
		System.out.println("Enter Sentance to find Java word");
		
		Pattern p = Pattern.compile("java",Pattern.CASE_INSENSITIVE);
		
		Matcher m = p.matcher("java bfgdjs java hdhdgdhcudiowldl c,dlde;fc sdk c;adcj a'dJAVAsfjvn lidcb ");
		int count = 0;
		while(m.find()) {
			count++;
			System.out.println(m.start()+" "+m.end()+" "+m.group());
		}
		System.out.println("Number of times Java Apppered is "+ count);
		
	}

}
