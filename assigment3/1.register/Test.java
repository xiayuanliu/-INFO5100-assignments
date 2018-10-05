package register;

public class Test {
	public static void main(String[] args) {
		Student a = new Student("Mike", 1);
		Student b = new Student("Tom", 2);
		Student c = new Student("Jane", 3);
		Student d = new Student("Amy", 4);
		Student e = new Student("Lily", 5);
		Student f = new Student("Harry", 6);
		Student g = new Student("Nill", 7);
		Student h = new Student("Tracy", 8);
		Student i = new Student("Tim", 9);
		Student j = new Student("Anne", 10);
		Student k = new Student("Lee", 11);
		
		Course course = new Course("Coding");
		course.registerStudent(a);
		course.registerStudent(b);
		course.registerStudent(c);
		course.registerStudent(d);
		course.registerStudent(e);
		course.registerStudent(f);
		course.registerStudent(g);
		course.registerStudent(h);
		course.registerStudent(i);
		course.registerStudent(j);
		for(Student s:course.getStudent()){
			System.out.println(s.getName());
			
			
		}
		course.registerStudent(k);
		
	}

}
