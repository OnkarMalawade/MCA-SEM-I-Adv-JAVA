import java.util.*;

public class StudentDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> s = new ArrayList<Student>();
		s.add(new Student(1,"Onkar",98,95,92));
		s.add(new Student(2,"Aniket",95,93,91));
		s.add(new Student(3,"Vishal",90,90,92));
		s.add(new Student(4,"Aditya",88,96,89));
		s.add(new Student(5,"Rahul",98,75,78));
		s.add(new Student(6,"Yash",99,75,87));
		s.add(new Student(7,"Dhruv",78,85,81));
		
		System.out.println("Student: " + s);
		
		Collections.sort(s);
		System.out.println("Sort by Name: " + s);
	}
}
