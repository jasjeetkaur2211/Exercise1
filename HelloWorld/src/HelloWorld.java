import java.io.*;


/**
 * @author Mohsen
 *
 */

/**
 * @modified Jasjeet
 */

public class HelloWorld {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*Initializing the newUser object with a Dummy userName */
		HelloUser newUser = new HelloUser("Dummy");
		
		System.out.println("Hello ASE2016 - how are you? :)");
		
		/* try .. catch block to handle IO Exception */
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("Please enter your name: ");
			
			/* Reading User Input for name */
			newUser.userName =	br.readLine();
			
			/* Calling the class function to print greeting message */
			newUser.greetUser();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}

}

