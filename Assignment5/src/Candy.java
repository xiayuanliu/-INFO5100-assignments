
public class Candy extends DessertItem {
    private double weight;
    private int pricePerPound;
    
    public Candy(String name, double weight, int pricePerPound) {
    	this.name = name;
    	this.weight = weight;
    	this.pricePerPound = pricePerPound;
    }

    public int getCost() {
    	return (int) Math.round(weight * pricePerPound);
    	
    }
    
    public String getWeight() {
    	return String.format("%.2f", weight); 
    } 
 
    public int getPricePerPound() {
    	return pricePerPound; 
    }
}

