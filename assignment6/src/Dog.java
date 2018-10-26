import java.util.Calendar;

public class Dog extends Pet implements Boardable{
	private String size;
	private Calendar start = Calendar.getInstance();
	private Calendar end = Calendar.getInstance();
	
	
	public Dog(String name, String ownerName, String color, String size) {
		super(name, ownerName, color);
		this.size = size;		
	}
	
	public String getSize() {
		return size;
	}
	
	public String toString() {
	    return "DOG:" + "\n" + super.toString() + "\n" + "Hair: " + getSize();
	}
	
	public void setBoardStart(int month, int day, int year) {
		start.set(month, day, year);
	}
	
	public void setBoardEnd(int month, int day, int year) {
		end.set(month, day, year);
	}
	
	public boolean boarding(int month, int day, int year) {
		Calendar today = Calendar.getInstance();
        today.set(month,day,year);
        return (today.after(start) && today.before(end)) || today.equals(start) || today.equals(end);
    }
	
}