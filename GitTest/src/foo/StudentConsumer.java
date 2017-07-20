package foo;

public class StudentConsumer {

	public static void main(String[] args){
		
		Student s1 = new Student();
		s1.setName("Ion");
		s1.setAge(24);
		
		System.out.println("Hello "+s1.getName());
	}
	
}
