package implicitpromotionofdatatypes;

/**
 * @author 1040231
 *
 */
public class ImplicitPromotionInConstructor {

	public ImplicitPromotionInConstructor() {
		System.out.println("no arg constructor");
	}

	public ImplicitPromotionInConstructor(Integer i) {
		System.out.println("Integer arg constructor");
	}

	public ImplicitPromotionInConstructor(Double d) {
		System.out.println("Double arg constructor");
	}

	public static void main(String[] args) {
		// implicit promotion is applicable only for primitive data types
		// implicit promotion is not applicable for Wrapper class i.e float
		// can't be promoted to Double implicitly
		ImplicitPromotionInConstructor ipic = new ImplicitPromotionInConstructor(12.3f); // c.e : The constructor ImplicitPromotionInConstructor(float) is undefined
	}
}
