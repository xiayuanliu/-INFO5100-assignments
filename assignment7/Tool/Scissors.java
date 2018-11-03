package Tool;

public class Scissors extends Tool {
	public  Scissors(int strength) {
		super(strength, 's');
	}
    
	public boolean fight(Tool tool) {
		if(tool instanceof Rock) {
			return this.strength / 2 > tool.strength;
		}
		else if(tool instanceof Paper) {
			return this.strength * 2 > tool.strength;
		}
		else {
			return this.strength > strength;
		}
	}
}