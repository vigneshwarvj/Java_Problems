package day04.solved;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User user1 = new User();
		
		
		
//   user1.name = "Hello";
		
        user1.email = "hello@gmail.com";
        user1.phoneNo = 9876543210l;
        
        //Setting the name
        boolean isName = user1.setName("Helloooo");
        
        boolean isSuccess = user1.setPassword("hello123");
        
        user1.toString();
        
        System.out.println(user1.name);
        
        System.out.println(user1.email);
        
        System.out.println(user1.phoneNo);
        
        System.out.println(isSuccess);
        
        System.out.println(isName);
        
	}

}
