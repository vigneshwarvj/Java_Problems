package day12.practice;

public class App {

	public static void main(String[] args) {
		UserValidation validate = new UserValidation();
		User user1 = new User();
		String name = "Vignesh";
		int id = 24;
		long phone = 9876543210l;
		String email = "vv@gmail.com";
		String password = "Vv@12345";
		
		
		validate.isNameValid(name);
		validate.isIdValid(id);
		validate.isPhoneValid(phone);
		validate.isEmailValid(email);
		validate.isPasswordValid(password);
		
		if (validate.isName == true) {
			user1.setName(name);
			System.out.println("Your Name is Valid : Your Name is " + user1.getName());
		} else {
			System.out.println("Your Name is Not Valid");
		}
		
		if (validate.isId == true) {
			user1.setId(id);
			System.out.println("Your ID is Valid : Your ID is " + user1.getId());
		} else {
			System.out.println("Your ID is Not Valid");
		}
		
		if (validate.isPhone == true) {
			user1.setPhone(phone);
			System.out.println("Your Phone Number is Valid : Your Phone number is " + user1.getPhone());
		} else {
			System.out.println("Your Phone Number is Not Valid");
		}
		
		if (validate.isEmail == true) {
			user1.setEmail(email);
			System.out.println("Your Email ID is Valid : Your Email id is " + user1.getEmail());
		} else {
			System.out.println("Your Email ID is Not Valid");
		}
		
		if (validate.isPassword == true) {
			user1.setPassword(password);
			System.out.println("Your Password is Valid : Your Password is " + user1.getPassword());
		} else {
			System.out.println("Your Password is Not Valid");
		}
		System.out.println(user1.toString());	
	}
}
