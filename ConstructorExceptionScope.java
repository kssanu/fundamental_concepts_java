import java.nio.file.FileAlreadyExistsException;

/**
 * @author sanu
 * need to handle checked exceptions in child constructor with broader scope of Exceptions
 * as child constructor invokes the parent constructor using super(). So it should have
 * broader scope than the exceptions thrown by parent constructor
 * no need to handle unchecked exceptions in child constructor
 */
public class ConstructorExceptionScope extends SecondConstructor {
	
	// no need to handle R.E
	// need to handle checked Exception
	public ConstructorExceptionScope() throws Exception {
	}
	
	

}

class SecondConstructor {
	public SecondConstructor() throws RuntimeException, FileAlreadyExistsException {

	}
}
