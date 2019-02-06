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
	
	private void m1(final int i, String s) {
		System.out.println("In m1 : final value of i is : " + i + " and value of string s : "+s);
		System.out.println("calling m2 trying to change i and s");
		m2(i, s);
		System.out.println("after calling m2 : final value of i is : " + i + " and value of string s : "+s);
	}
	
	private void m2(int i, String s) {
		i = 4; // no c.e as java is pass by value
		s = "kumar";
		System.out.println("In m2 : value of i is : " + i + " and value of string s : "+s);
	}
	
	private void m3(final Map<String, String> properties) {
		System.out.println("In m3 : final value of properties is : " + properties);
		System.out.println("calling m4 trying to add some entries in map");
		m4(properties);
		System.out.println("after calling m4 : value of properties is : " + properties);
	}
	
	private void m4(final Map<String, String> properties) {
		properties.put("third", "kumar sanu");
		System.out.println("In m4 : value of properties is : " + properties);
	}
}