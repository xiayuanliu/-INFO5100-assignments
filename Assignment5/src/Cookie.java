public class Cookie extends DessertItem {
    private int number;
    private int pricePerDozen;
    
    public Cookie(String name, int number, int pricePerDozen) {
    	this.name = name;
    	this.number = number;
    	this.pricePerDozen = pricePerDozen;
    }

    public int getCost() {
    	return Math.round(number * pricePerDozen/12);
    	
    }
    
    public int getNumber() {
    	return number; 
    } 
 
    public int getPricePerDozen() {
    	return pricePerDozen; 
    }
}
