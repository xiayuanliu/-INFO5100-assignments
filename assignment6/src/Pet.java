
public class Pet {
	public static final int MALE = 0;
	public static final int FEMALE = 1;
	public static final int SPAYED = 2;
	public static final int NEUTERED = 3;
	private String petName;
	private String ownerName;
	private String color;
	protected int sex;
	
    public Pet(String name, String ownerName, String color) {
    	this.petName = name;
    	this.ownerName = ownerName;
    	this.color = color;
    }
    
    public String getPetName() {
    	return petName;
    }
    
    public String getOwnerName() {
    	return ownerName;
    }
    
    public String getColor() {
    	return color;
    }
    
    public void setSex(int sexid) {
    	sex = sexid;
    }
    
    public String getSex() {
    	switch(sex){
    		case 0: return "MALE";
    		case 1: return "FEMALE";
    		case 2: return "SPAYED";
    		case 3: return "NEUTERED";
    		default: return "ERROR";  		
    		}  		
    	}
    
    public String toString() {
    	return petName +" owned by " + ownerName + "\n" + 
               "Color: " + color +"\n" + "Sex: " + getSex();
        
    }
    }
