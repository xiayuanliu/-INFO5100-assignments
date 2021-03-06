
/**
 * Assignment for your lecture 2. Please finish all the questions under 'Assignment'
 * Please try to think the extra credit question. 
 * The deadline of this assignment is 09/21/2018 23:59 PST.
 * Please feel free to contact Amanda and Zane for any questions.
 */

class Employee {
    String name;
    int age;
    Gender gender;
    double salary;// salary per month

    // Constructor. Please set all the data in constructor.
    public Employee(String name, int age, Gender gender, double salary) {
	// scores: 2/2
        this.name = name;
        this.age = age;
	this.gender = gender;
	this.salary = salary;//write your code here
    }
    
    // Getter for `name`. Return the current `name` data
    public String getName() {
    	return this.name;//write your code here
    }

    // Setter for `name`. Set `name` data
    public void setName(String name) {
    	this.name = name;//write your code here
    }
}

enum Gender {
    MALE,
    FEMALE;
}


public class Assignment2 {
    // Assignment

    /**
     * Write a method to calculate the Social Security Tax of an employee and print it.
     * If the salary is less than or equal to 8900, the Social Security Tax is 6.2% of the salary.
     * If the salary is more than 8900, the Social Security Tax is 6.2% of 106,800.
     */
    public double socialSecurityTax(Employee employee) {
	    // scores: 1/2
        double tax;
	if(employee.salary <= 8900){
	    tax = employee.salary * 6.2%;
		// 6.2% should be 0.0062
	    }
	else{
	    tax = 106800 * 6.2%;//write your code here
		// 6.2% should be 0.0062
	    }
	return tax;
	System.out.println("The Social Security Tax of" + employee.getName + "is" + tax);
	    // write the print function before return
    }

    /**
     * Write a method to calculate an employee's contribution for insurance coverage and print it.
     * Amount of deduction is computed as follows:
     * If the employee is under 35, rate is 3% of salary; if the employee is between 35 and 50(inclusive), rate is 4% of salary;
     * If the employee is between 50 and 60(exclusive), rate is 5% of salary; If the employee is above 60, rate is 6% of salary.
     */
    public double insuranceCoverage(Employee employee) {
	    // scores: 1/2
	    // Don't use % to present presentage. % means modulo in Java.
	    // write the print function before return
        double contribution;
	if(employee.age < 35){
	    contribution = employee.salary * 3%;
	    }
	else if(employee.age <= 50){
	    contribution = employee.salary * 4%;	
	    }
	else if(employee.age < 60){
	    contribution = employee.salary * 5%；
	    }
	else{
	    contribution = employee.salary * 6%;
	    }
	return contribution;
	System.out.println("The contribution for insurance coverage of" + employee.getName + "is" + contribution);//write your code here
    }

    /**
     * Write a method to sort three employees' salary from low to high, and then print their name in order.
     * For example, Alice's salary is 1000, John's salary is 500, Jenny's salary is 1200, you should print:
     * John Alice Jenny
     */
    public void sortSalary(Employee e1, Employee e2, Employee e3) {
	    // scores: 2/2
        Emplpyee[] e = {e1, e2, e3};
	for(int j=0; j < e.length, j++){
	    for(int i = 0; i < e.length - j, i++){
	        if(e[i].salary > e[i+1].salary){
		    Employee temp = e[i];
		    e[i+1] = e[i];
		    e[i] = temp;
		    }
		}
	}
        System.out.println(e[0].getName+ " " + e[1].getName + " " + e[2].getName);	
	}
			
		//write your code here
    }

    /**
     * Write a method to raise an employee's salary to three times of his/her original salary.
     * Eg: original salary was 1000/month. After using this method, the salary is 3000/month.
     * Do not change the input of this method.
     * Try to add a new method in Employee class: public void raiseSalary(double byPercent)
     */
    public void tripleSalary(Employee employee) {
	    // scores: 2/2
	    // We'd better not modify the employee data in this funtion. 
	    // In stead we'd better write a function in `Employee` class called `public void raiseSalary(double byPercent)`.
	    // Then in `tripleSalary` we just call `employee.raiseSalary(percent);`
        double temp;
	temp = employee.salary *3;
	employee.salary = temp;//write your code here
    }

    public void raiseSalary(double byPercent){
	double temp;
	temp = employee.salary * (1 + byPercet/100);
	employee.salary = temp;
    }

    //Extra credit

    /**
     * I have written some code below. What I want is to swap two Employee objects.
     * One is Jenny and one is John. But after running it, I got the result below:
     * Before: a=Jenny
     * Before: b=John
     * After: a=Jenny
     * After: b=John
     * There is no change after swap()! Do you know the reason why my swap failed?
     * Write your understanding of the reason and explain it.
     */
    /*
      Why swap failed?
      // scores: 2/2
	  Because the parameters of method are passed by value.
	  When we put a and b to swap(), swap() creats a copy of the values of references a and b then dose its work.
	  After method, nothing changes in references a and b.
	  write your understanding here.
    */
    public static void main(String[] args) {
        Employee a = new Employee("Jenny", 20, Gender.FEMALE, 2000);
        Employee b = new Employee("John", 30, Gender.MALE, 2500);
        System.out.println("Before: a=" + a.getName());
        System.out.println("Before: b=" + b.getName());
        swap(a, b);
        System.out.println("After: a=" + a.getName());
        System.out.println("After: b=" + b.getName());
    }

    public static void swap(Employee x, Employee y) {
        Employee temp = x;
        x = y;
        y = temp;
    }
}

// Total scores: 10/10
