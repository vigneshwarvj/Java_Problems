package day04.solved;

public class User {

 String name;
 String email;
 String password;
 long phoneNo; 

// public void setName(String newName) {
//	 name = newName;
//	 return true;
// }
 
 //Setting the name
 public boolean setName(String newName) {
	 try {
		 name = newName;
		 return true;
	 }catch(Exception e) {
		 return false;
	 }
 }
 
 
 //Setting the password
public boolean setPassword(String newPassword) {
	try {
		password = newPassword;
		return true;
	} catch(Exception e) {
		return false;
	}
	
}


@Override
public String toString(){
	String userDetails = "Name: " + name + " Email: " + email + " Phone No:" + phoneNo + " Password: " + password;
	
	System.out.println(userDetails);
	return userDetails;
	
}

}
