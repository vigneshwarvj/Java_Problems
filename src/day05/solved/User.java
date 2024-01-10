package day05.solved;

import java.util.Random;

public class User {

String name;
String email;
String password;
long phoneNo;
int id;

public User(String newEmail, String newPassword) {
	Random r = new Random();
	id = r.nextInt();
	
	email = newEmail;
	password = newPassword;
}

//Set Name
public void setName(String newName) {
	name = newName;
}
public String getName() {
	return name;
}

//Set Email
public void setEmail(String newEmail) {
	email = newEmail;
}
public String getEmail() {
	return email;
}

//Set Password
public void setPassword(String newPassword) {
	password = newPassword;
}
public String getPassword() {
	return password;
}

//Set Phone no
public void setPhoneNo(long newPhoneNo) {
	phoneNo = newPhoneNo;
}
public long getPhoneNo() {
	return phoneNo;
}

//Set Id
public void setId(int newId) {
	id = newId;
}
public int getId() {
	return id;
}

@Override
public String toString() {
	String userDetails = "Name: " + name + " Email: " + email + " Password: " + password + " Phone No: " + phoneNo
			+ " User Id: " + id;
	return userDetails;
	
}

}
