package map;

public class ExceptionTest extends Exception {

	private static final long serialVersionUID = 1L;

	public ExceptionTest() {
	}

	public ExceptionTest(String message) {
		super(message);
	}
	public static void main(String[] args) {
		  try
	        { 
	            // Throw an object of user defined exception 
	            throw new ExceptionTest("GeeksGeeks"); 
	        } 
	        catch (ExceptionTest ex) 
	        { 
	            System.out.println("Caught"); 
	  
	            // Print the message from MyException object 
	            System.out.println(ex.getMessage()); 
	        } 
	}

}
