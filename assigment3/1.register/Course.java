package register;

public class Course {
	private String name;
    private int numberOfStudent = 0;
    Student[] arry = new Student[10];
    Course(String title) {
    	name = title;
    } 
    
    public Student[] getStudent() {
    	return arry;    	
    }
    public boolean isFull() {
    	if(numberOfStudent < 10)
    	    return false;
    	else
    		return true;
    }
    public int getNumberOfStudent() {
    	return numberOfStudent;
    }
    public String getTitle() {
    	return name;
    } 
    public void registerStudent(Student student) {
    	if(!isFull()) {
    		arry[numberOfStudent] = student;
    		numberOfStudent++;
    	}
    	else
    		System.out.println("The course if full");
    }
}

