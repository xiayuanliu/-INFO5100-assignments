import java.util.Vector;

public class Checkout {
    public Vector<DessertItem> items;
    
    public Checkout() {
    	items = new Vector<DessertItem>();
    }
    
    public int numberOfItems() {
    	return items.size();
    }
    
    public void enterItem(DessertItem item) {
    	items.add(item);
    }
    
    public void clear() {
    	items.clear();
    }
    
    public int totalCost() {
    	int totalCost = 0;
    	for(DessertItem item : items) {
    		totalCost += item.getCost();    		
    	}
    	return totalCost;	
    }
    
    public int totalTax() {
    	int totalTax;
    	totalTax = (int)(totalCost() * DessertShoppe.TAX_RATE + 0.5);
    	return totalTax;
    }
    
    public String toString() {
    	String str = "          " + DessertShoppe.NAME +"\n" +"          ";
    	for(int i = 0;i < DessertShoppe.NAME.length();i++){
    		str +="-";
    	}
		for (DessertItem item : items) {
			if (item instanceof Sundae) {
				str += "\n" + String.format("%-26s", item.getName().split(",")[0]) + "\n"+ String.format("%-26s", item.getName().split(",")[1])+ String.format("%14s", DessertShoppe.cents2dollarsAndCents(item.getCost()));
			}
			else if (item instanceof IceCream) {
				str += "\n" + String.format("%-26s", item.getName()) + String.format("%14s", DessertShoppe.cents2dollarsAndCents(item.getCost()));
			}
			else if (item instanceof Cookie) {
				str += "\n"+ String.format("%-26s", ((Cookie) item).getNumber() + " @ "+ DessertShoppe.cents2dollarsAndCents(((Cookie) item).getPricePerDozen()) + " /dz.")+ "\n" + String.format("%-26s", item.getName())+ String.format("%14s", DessertShoppe.cents2dollarsAndCents(item.getCost()));
			}
			else {
				str += "\n"+ String.format("%-26s", ((Candy) item).getWeight() + " lbs. @ "+ DessertShoppe.cents2dollarsAndCents(((Candy) item).getPricePerPound()) + " /lb.")+ "\n"+ String.format("%-26s", item.getName())+ String.format("%14s", DessertShoppe.cents2dollarsAndCents(item.getCost()));
			}
		}
		str += "\n\n" + String.format("%-26s", "Tax")+ String.format("%14s", DessertShoppe.cents2dollarsAndCents(totalTax())) + "\n"+ String.format("%-26s", "Total Cost")+ String.format("%14s", DessertShoppe.cents2dollarsAndCents(totalCost() + totalTax())) + "\n";
		return str;
	}
    
}
    

