package day05.practice;

import java.util.Random;

public class StudentDetail {
    String studentName;
    long studentRollNo;
    char gender;
    byte age;
    String studentEmail;
    double percentage;
    double height;
    int studentId;
	  
    public StudentDetail(String newName, String newEmail) {
    	Random r = new Random();
     	studentId = r.nextInt();

     	studentName = newName;
     	studentEmail = newEmail;
    }    
    
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

//   	public boolean setChar(char newChar) {
//   		try {
//   			gender = newChar;
//   			return true;
//   		} catch (Exception e) {
//   			return false;
//   		}
//   	}
//   	public char getChar() {
//   		return gender;
//   	}
   	
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
       
//Student Id       
       public boolean setStudentId(int newStudentId) {
    	   try {
    		   studentId = newStudentId;
    		   return true;
    	   }catch (Exception e) {
    	   return false;
    	   }
       } public int getStudentId() {
    	   return studentId;
       }
       
       @Override
   	public String toString() {
   		String studentDetails = "Name: " + studentName + " Roll No: " + studentRollNo + " Gender: " + gender + " Age: " + age
   				+ " Email:" + studentEmail + " Overall Percentage: " + percentage + " Height: " + height + " Student ID: " + studentId;
   		//System.out.println(userDetails);
   		return studentDetails;
   	}
       
}

