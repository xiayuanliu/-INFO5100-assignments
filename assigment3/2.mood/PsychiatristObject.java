package Mood;

public class PsychiatristObject {
	//asks a moody object about its mood
	public void examine(MoodyObject moodyObject) {
	    System.out.println("How are you feeling today?");	
	    System.out.println(moodyObject.getMood());
	    System.out.println();
	};
	//a moodyObject is observed to either laugh or cry
	public void observe(MoodyObject moodyObject) {
		moodyObject.expressFeelings();
		System.out.println("Obeservation: " + moodyObject.toString());	
		System.out.println();
	};
}
