package day06.solved;

public class UserStringDemoApp {

	// App.java
	    public static void main(String[] args) {
	    	UserStringDemo newUser = new UserStringDemo("john", "doe", " jDoe@EXAMPLE.Com ", "password123", " 123-456-7890 ");
	        newUser.toString();

	        // checking password
	        System.out.println(newUser.authenticate("password123"));  // prints: true
	        System.out.println(newUser.authenticate("wrongpassword"));  // prints: false
	    }
	}

	

