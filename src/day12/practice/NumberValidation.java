package day12.practice;

//Write a Java method to validate a phone number. A valid phone number consists of 10 digits.

public class NumberValidation {

	public static void main(String[] args) {
		
		long phoneNo = 9988776655L;
		
		NumberValidation numberValidation = new NumberValidation();
		
		System.out.println(numberValidation.isPhoneNoValid(phoneNo));
	}

	public boolean isPhoneNoValid(long phoneNo) throws IllegalArgumentException {
		try {
			if (phoneNo < 6000000000L || phoneNo > 9999999999L) {
				throw new IllegalArgumentException("Invalid Phone Number");
			}
			System.out.println(phoneNo);
			return true;
		} catch (RuntimeException e) {
			return false;
		}
	}
}


