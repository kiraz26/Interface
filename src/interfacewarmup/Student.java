package interfacewarmup;

public class Student implements Mentorship {

	@Override
	public void canLearn() {
		System.out.println("learning");
		
	}

	@Override
	public void mentor() {
		System.out.println("get mentor");
		
	}
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.canLearn();
		s1.mentor();
	}

}
