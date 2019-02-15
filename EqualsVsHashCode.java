package equalsvshashcode;

import java.util.HashSet;
import java.util.Set;

import classdefinition.Parent;

/**
 * @author 1040231
 *
 */
public class EqualsVsHashCode {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Set<Parent> pSet = new HashSet<>();
		Parent p1 = new Parent(1, "p1", "svm");
		Parent p2 = new Parent(1, "p1", "svm");
		
		pSet.add(p1);
		
		// any method of HashMap or HashSet checks for hashCode first. Being
		// unequal hashCodes (in case hashCode method is not overridden) will
		// print false even if obj1.equals(obj2) returns true
		System.out.println("check whether set contains p2 or not : " + pSet.contains(p2));
		
		// in hashMap or HashSet hashCode of the objects are looked first. Being
		// unequal hashCodes (in case hashCode method is not overridden) will
		// lead both of them to be added even if obj1.equals(obj2) returns true
		System.out.println("add p2 in set " + pSet.add(p2)); 
		System.out.println(pSet);
		
		// Parent doesn't override equals whether hashCode is overridden or not : Prints false
		// Parent overrides equals whether hashCode is overridden or not : Prints true
		System.out.println(p1.equals(p2));
		
		// Parent doesn't override hashCode method whether equals is overridden or not : Prints different hashCodes
		// Parent overrides hashCode method whether equals is overridden or not : Prints same hashCodes
		System.out.println("hashcode p1 : " + p1.hashCode() + " hashcode p2 : " + p2.hashCode()); 
		
	}

}
