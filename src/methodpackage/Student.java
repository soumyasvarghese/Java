package methodpackage;

public class Student {
	int studentid;
	String studentname;
	String studentcourse;
	String studentcollege="IHRD";
	 public Student(int studentid,String studentname,String studentcourse)
	 {
		 this.studentid=studentid;
		 this.studentname=studentname;
		 this.studentcourse=studentcourse;
	 }
	 public void display()
	 {
		 System.out.println("Student ID:"+studentid);
		 System.out.println("Student Name:"+studentname);
		 System.out.println("Student Course:"+studentcourse);
	 }

	public static void main(String[] args) {
		Student s=new Student(1,"Anu","MCA");
		s.display();
		

	}

}
