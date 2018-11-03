package Tool;

public class Paper extends Tool {
	public  Paper(int strength) {
		super(strength, 's');
	}
    
	public boolean fight(Tool tool) {
		if(tool instanceof Scissors) {
			return this.strength / 2 > tool.strength;
		}
		else if(tool instanceof Rock) {
			return this.strength * 2 > tool.strength;
		}
		else {
			return this.strength > strength;
		}
	}
}