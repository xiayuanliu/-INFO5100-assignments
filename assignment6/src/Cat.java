import java.util.*;
public class Cat extends Pet implements Boardable{
	private String hairLength;
	private Calendar start = Calendar.getInstance();
	private Calendar end = Calendar.getInstance();
	
	
	public Cat(String name, String ownerName, String color, String hairLength) {
		super(name, ownerName, color);
		this.hairLength = hairLength;		
	}
	
	public String getHairLength() {
		return hairLength;
	}
	
	public String toString() {
	    return "CAT:" + "\n" + super.toString() + "\n" + "Hair: " + getHairLength();
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