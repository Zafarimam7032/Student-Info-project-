package com.student.java;

public class StudentData {
 private String  studentName;
 private String city;
 private String phoneNumber;
 private String deparment;
public String getStudentName() {
	return studentName;
}
public void setStudentName(String studentName) {
	this.studentName = studentName;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getPhoneNumber() {
	return phoneNumber;
}
public void setPhoneNumber(String phoneNumber) {
	this.phoneNumber = phoneNumber;
}
public String getDeparment() {
	return deparment;
}
public void setDeparment(String deparment) {
	this.deparment = deparment;
}

 @Override
public String toString() {
	return "StudentData [studentName=" + studentName + ", city=" + city + ", phoneNumber=" + phoneNumber
			+ ", deparment=" + deparment + "]";
}
public static void main(String[] args) {
	StudentData obj=new StudentData();
	obj.setStudentName("zafar imam");
	obj.setCity("New Delhi");
	obj.setDeparment("devloper ");
	obj.setPhoneNumber("3948584309");
	System.out.println(obj);
	
}
}
