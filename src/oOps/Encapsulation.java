package oOps;
 class Student{
    private String  studentId;
    private String firstName;
    private String lastName;
    private String studentEmail;
    private String studentPhone;
    public Student()
    {
    }
public Student(String  studentId,String firstName,String lastName,
		String studentEmail,String studentPhone) {
    this.studentId = studentId;
    this.lastName = lastName;
    this.firstName = firstName;
    this.studentEmail = studentEmail;
    this.studentPhone = studentPhone;
}
public String getStudentId() {
    return studentId;   }
public void setStudentId(String studentId) {
    this.studentId = studentId; }
public String getFirstName() {
    return firstName;   }
public void setfirstName(String firstName) {
    this.firstName = firstName;   }
public String getlastName() {
    return lastName;}
public void setlastName(String lastName) {
    this.lastName = lastName;}
public String getstudentEmail() {
    return studentEmail;   }
public void setstudentEmail(String studentEmail) {
    this.studentEmail = studentEmail;   }
public String getstudentPhone() {
    return studentPhone;   }
public void setstudentPhone(String studentPhone) {
    this.studentPhone = studentPhone;   }

public void talkaboutStudent () {
    System.out.print("Student is Id " + this.studentId + ", ");
    System.out.print("Student first name is " + this.firstName + ", ");
    System.out.print("Student Lastname is " + this.lastName + ", ");
    System.out.print("Student email is " + this.studentEmail+ ", ");
    System.out.println("Student phone number  is " + this.studentPhone+ ".");
}
}

public class Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student data =new Student ("0001","Micheal","Gabriel","mgabriel@perscholas.org","123-456-7890");
		
	      // data.setStudentId("0001") ;
	       //data.setfirstName("Micheal");
	      // data.setlastName("Gabriel") ;
	      // data.setstudentEmail("mgabriel@perscholas.org");
	       //data.setstudentPhone ("123-456-7890") ;
	       data.talkaboutStudent();
	       
	       Student data2 =new Student ();
			
	       data2.setStudentId("0002") ;
	       data2.setfirstName("Bairon");
	       data2.setlastName("Vasquez") ;
	       data2.setstudentEmail("bvasquez@perscholas.org");
	       data2.setstudentPhone ("123-456-7891");
	       data2.talkaboutStudent();

	}

}
