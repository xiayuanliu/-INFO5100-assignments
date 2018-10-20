
public class IceCream extends DessertItem{
	public int cost;
	
	public IceCream() {}
	
	public IceCream(String name, int cost) {
        this.name = name;
        this.cost = cost;
	}
	
	public int getCost() {
		return cost;
	}

}
