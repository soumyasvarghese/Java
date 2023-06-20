package arrayprogram;

public class Stringoperator {

	public static void main(String[] args) {
		// 1.Concatenation
		String s="HELLO";
		String s1=" Welcome";
		String s2="hello";
		String s3="   Luminar   ";
		String s4="how are you";
		System.out.println(s.concat(s1));
		System.out.println(s+s1);
		System.out.println(1+2+s+4+5);//1+2=3+s=3Hello+4+5=3Hello45
		
		//2. Comparison
		System.out.println(s.equals(s1));
		System.out.println(s.equals(s2));
		System.out.println(s.equalsIgnoreCase(s2));
		
		//3. contains
		System.out.println(s4.contains("are"));
		
		//4.Uppercase & lower case
		System.out.println(s2.toUpperCase());
		System.out.println(s.toLowerCase());
		
		//5. trim
		System.out.println(s3.trim());
		
		//6. Startswith and endswith
		System.out.println(s4.startsWith("how"));
		System.out.println(s4.endsWith("you"));
		
		//7. Length
		System.out.println(s.length());
		
		//8. charAt
		System.out.println(s.charAt(0));
		
		//9. split
		String[] sr=s4.split(" ");
		for(String v:sr)
		{
			System.out.println(v);	
		}
				
		// 10.substring
		System.out.println(s1.substring(2,6));

	}

}
