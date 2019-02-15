package implicitpromotionofdatatypes;

/**
 * @author sanu
 *	Implicit promotion is applied only for primitive data types
 *	Not applicable for Wrapper classes. i.e promotion can happen in
 *	following ways : byte -> shor -> int -> long -> float -> double
 *	or char -> int -> long -> float -> double
 *	but not this Byte -> Short -> Integer -> Long -> Float -> Double
 */
public class ImplicitPromotionInConstructor {

	public ImplicitPromotionInConstructor() {
		System.out.println("no arg constructor");
	}

	public ImplicitPromotionInConstructor(int i) {
		System.out.println("Integer arg constructor");
	}

	public ImplicitPromotionInConstructor(Double d) {
		System.out.println("Double arg constructor");
	}

	public static void main(String[] args) {
		// implicit promotion is applicable only for primitive data types
		// implicit promotion is not applicable for Wrapper class i.e float
		// can't be promoted to Double implicitly
		// ImplicitPromotionInConstructor ipic = new ImplicitPromotionInConstructor(12.3f); 
		// c.e : The constructor ImplicitPromotionInConstructor(float) is undefined
		
		// this will work as char -> int is possible
		ImplicitPromotionInConstructor ipic1 = new ImplicitPromotionInConstructor('v'); 
	}
}
