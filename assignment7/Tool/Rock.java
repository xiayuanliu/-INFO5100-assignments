package Tool;

public class Rock extends Tool {
	public Rock(int strength) {
		super(strength, 'r');
	}
    
	public boolean fight(Tool tool) {
		if(tool instanceof Paper) {
			return this.strength / 2 > tool.strength;
		}
		else if(tool instanceof Scissors) {
			return this.strength * 2 > tool.strength;
		}
		else {
			return this.strength > strength;
		}
	}
}
