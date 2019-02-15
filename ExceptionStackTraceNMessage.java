/**
 * @author sanu
 * difference between e.printStackTrace(), syso(e.getMessage()) and syso(e)
 * e.printStackTrace() prints the complete stackframe trace
 *  "java.lang.ArithmeticException: / by zero
 * 		at exceptionrelated.ExceptionStackTraceNMessage.main(ExceptionStackTraceNMessage.java:7)
 * 
 * e.getMessage() : just prints the message : "/ by zero" in this case
 * e : prints error without stack frame : "java.lang.ArithmeticException: / by zero" in this case
 */
public class ExceptionStackTraceNMessage {

	public static void main(String[] args) {
		try {
			System.out.println(10/0);
		} catch(Exception e) {
			System.out.println(e);
			System.out.println("========");
			System.out.println(e.getMessage());
			System.out.println("========");
			e.printStackTrace();
		}
	}
}
