package constructorrelated;

/**
 * @author sanu
 *
 */
public class RecursiveConstructorCE {

	public RecursiveConstructorCE() {
		// RecursiveConstructorCE(10); // this is a method call not a
		// constructor call
		this(10);
	}

	public RecursiveConstructorCE(int i) {
		this();
	}
}
