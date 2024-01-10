package day04.practice;

public class StudentDetail1 {

     String studentName;
     long studentRollNo;
     char gender;
     byte age;
     String studentEmail;
     double percentage;
     double height;
	  
     
//Student Name
     public boolean setName(String newName) {
    		try {
    			studentName = newName;
    			return true;
    		} catch (Exception e) {
    			return false;
    		}
    	}
    	public String getName() {
    		return studentName;
    	}

//Student Roll no
    	public boolean setStudentRollNo(long newStudentRollNo) {
    		try {
    			studentRollNo = newStudentRollNo;
    			return true;
    		} catch (Exception e) {
    			return false;
    		}
    	}
    	public long getStudentRollNo() {
    		return studentRollNo;
    	}

//Gender
    	public boolean setStudentGender(char newStudentGender) {
    		try {
    			gender = newStudentGender;
    			return true;
    		} catch (Exception e) {
    			return false;
    		}
    	}
    	public char getStudentGender() {
    		return gender;
    	}

//Age
    	public boolean setStudentAge(byte newStudentAge) {
    		try {
    			age = newStudentAge;
    			return true;
    		} catch (Exception e) {
    			return false;
    		}
    	}
    	public byte getStudentAge() {
    		return age;
    	}

//Student Email
        public boolean setStudentEmail(String newEmail) {
    		try {
    			studentEmail = newEmail;
    			return true;
    		} catch (Exception e) {
    			return false;
    		}
    	}
    	public String getStudentEmail() {
    		return studentEmail;
    	}
    	
//Percentage
    	public boolean setPercentage(double newPercentage) {
    		try {
    			percentage = newPercentage;
    			return true;
    		} catch (Exception e) {
    			return false;
    		}
    		}

    	public double getPercentage() {
    		return percentage;
    	}

    	
//Height
    	public boolean setHeight(double newHeight) {
    		try {
    			height = newHeight;
    			return true;
    		} catch (Exception e) {
    			return false;
    		}
    	}
        public double getHeight() {
        		return height;
        	}
        
        @Override
    	public String toString() {
    		String studentDetails = "Name: " + studentName + " Roll No: " + studentRollNo + " Gender: " + gender + " Age: " + age
    				+ " Email:" + studentEmail + " Overall Percentage: " + percentage + " Height: " + height;
    		//System.out.println(userDetails);
    		return studentDetails;
    	}
        
}

