
public class Main{
	
	public static void main(String[] args) {
		
		System.out.println(reverseString("Murali Krishna"));
	}
	
	
//	public static String isOddOrEven(int num) {
//		
//		if(num%2==0) {
//			return "Even";
//		}
//		return "Odd";
//		
//		
//	}
	
	
	public static StringBuffer reverseString(String str) {
		
		StringBuffer strB = new StringBuffer();
		
		for(int i=str.length()-1;i>=0;i--) {
			strB.append(str.charAt(i));
		}
		
		return strB;
		
	}
	
}
