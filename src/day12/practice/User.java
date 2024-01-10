package day12.practice;

public class User {

	int id;
	String name;
	String password;
	String email;
	long phone;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long newPhone) {
		this.phone = newPhone;
	}

	@Override
	public String toString() {
		String userDetails = "USER DETAILS" + "\n" + "User Name: " + getName() + "\n" + "User Email: " + getEmail()
				+ "\n" + "User Phone Number: " + getPhone() + "\n" + "User ID:" + getId();
		return userDetails;

	}
}
