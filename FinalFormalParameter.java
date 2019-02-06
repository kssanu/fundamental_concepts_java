/**
* to depict the use of final formal parameter : only point is you cannot assign a new value to final formal parameter, but can make modification
o/p :
In m1 : final value of i is : 50 and value of string s : sanu
calling m2 trying to change i and s
In m2 : value of i is : 4 and value of string s : kumar
after calling m2 : final value of i is : 50 and value of string s : sanu
after calling substring : sa
++++++++++++++++++++++++++++
In m3 : final value of properties is : {first=kumar, second=sanu}
calling m4 trying to add some entries in map
In m4 : value of properties is : {third=kumar sanu, first=kumar, second=sanu}
after calling m4 : value of properties is : {third=kumar sanu, first=kumar, second=sanu}
Finally in main changed properties value is {third=kumar sanu, fourth=unable to insert, first=kumar, second=sanu}
*/
import java.util.Map;
import java.util.HashMap;
public class FinalFormalParameter {
	public static void main (String[] ar){
		FinalFormalParameter ffp = new FinalFormalParameter();
		ffp.m1(50, "sanu");
		System.out.println("++++++++++++++++++++++++++++");
		Map<String, String> properties = new HashMap<>();
		properties.put("first", "kumar");
		properties.put("second", "sanu");
		ffp.m3(properties);
		
		System.out.println("Finally in main changed properties value is " + properties);
	}
	
	private void m1(final int i, final String s) {
		System.out.println("In m1 : final value of i is : " + i + " and value of string s : "+s);
		System.out.println("calling m2 trying to change i and s");
		// can change the value
		m2(i, s);
		
		// can modify string
		System.out.println("after calling substring : " + s.substring(0,2));
		System.out.println("after calling m2 : final value of i is : " + i + " and value of string s : "+s);
		// i =5; // c.e : final parameter i may not be assigned
	}
	
	private void m2(int i, String s) {
		i = 4; // no c.e as java is pass by value
		s = "kumar";
		System.out.println("In m2 : value of i is : " + i + " and value of string s : "+s);
	}
	
	private void m3(final Map<String, String> properties) {
		System.out.println("In m3 : final value of properties is : " + properties);
		System.out.println("calling m4 trying to add some entries in map");
		// can modify the content of map
		m4(properties);
		properties.put("fourth", "able to insert");
		
		System.out.println("after calling m4 : value of properties is : " + properties);
		// properties = new HashMap<>(); // c.e : final parameter properties may not be assigned
	}
	
	private void m4(final Map<String, String> properties) {
		properties.put("third", "kumar sanu");
		System.out.println("In m4 : value of properties is : " + properties);
	}
}
