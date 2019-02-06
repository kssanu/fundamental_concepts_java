/**
* places final variable can be declared and initialized
*/
public class FinalIVariableDeclarationNInitialization {
	// instnace variable : need to be initialized before completion of a constructor
	// i.e can be initialized in an "instance block", in each constructor or at the time of declaration
	// apart from these places c.e : variable x might not have been initialized
	final int x;
	
	// static variable : need to be initialized before completion of a constructor
	// i.e can be initialized in a "static block" or at the time of declaration
	// apart from these places c.e : variable y might not have been initialized
	final static int y;
	
	TestFinalInstanceVariable() {
		x =10; // a) can be initialized here
// 		y=2; will give c.e : cannot assign a value to final variable y
	}
	{
// 		x = 5; // b) can also be initialized here but not at the same time i.e either at a or b
	}
	static {
		y =10;
	}

	public static void main(String[] ar) {
		// local variable : no need to initialize if not using it.
		final int x;
	}
}
