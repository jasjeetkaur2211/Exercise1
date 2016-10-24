
public class HelloUser {
	public String userName;
	// The name variable is assigned in the constructor.
	   public HelloUser (String uName) {
	      userName = uName;
	   }
	public void greetUser() {
		System.out.println("Hello " + userName + "!");
	}
}
