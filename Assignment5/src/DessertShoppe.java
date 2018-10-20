
public class DessertShoppe {
	public static final String NAME = "M & M Dessert Shoppe";
	public static final double TAX_RATE = 0.65;
	public static final int MAX_NAME = 26;
	public static final int MAX_WIDTH_DISPALY = 40;
	
    public static String cents2dollarsAndCents(int cents) {
    	int dollar = cents/100;
    	double dollarsAndCents = dollar + cents%100/100.0;
    	return String.valueOf(dollarsAndCents);
    }
}
