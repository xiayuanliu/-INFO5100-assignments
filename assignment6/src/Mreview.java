import java.util.*;

public class Mreview implements Comparable<Mreview> {
	private String title;
	private ArrayList<Integer> ratings;
	
	public Mreview() {
		title = "";
			
	}
	
	public Mreview(String ttl) {
		title = ttl;
		ratings = new ArrayList<Integer>();	
	}
	
	public Mreview(String ttl, int firstRating) {
		title = ttl;
		ratings = new ArrayList<Integer>();
		ratings.add(firstRating);
	}

	public void addRating(int r) {
		ratings.add(r);
	}
	
	public double aveRating() {
		int sum = 0;
		for(int r : ratings) {
			sum += r;
		}
		double ave = ((double) sum)/ ratings.size();
		
		return ave;
		
		
	}
	
	public int compareTo(Mreview obj) {
		return title.compareTo(obj.title);
	}
	
	public boolean equals(Mreview obj) {
		return title.equals(obj.title);
	}
	
	public String getTitle(){
		return title;
	}
	
	public int numRatings() {
		return ratings.size();
	}
	
	public String toString() {
		return title + ", averge "+this.aveRating()+" out of "+ this.numRatings() + " ratings";
	    }

	
	public static void main(String[] args) {
		Mreview mrv = new Mreview("Kill Bill");
		mrv.addRating(3);
		mrv.addRating(4);
		mrv.addRating(5);
		System.out.print(mrv.toString());
	}
	
}
