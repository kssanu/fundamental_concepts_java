public class TestFinalInstanceVariable {
	final int x;
	final static int y;
	TestFinalInstanceVariable() {
		x =10;
		y=2;
	}
	
	/* TestFinalInstanceVariable(int i) {
	} */
	public static void main(String[] ar) {
		final int x;
	}
}