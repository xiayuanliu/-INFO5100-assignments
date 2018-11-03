import java.util.*;

public class MyIndexOutOfBoundException extends IndexOutOfBoundsException{
    private int lowerBound;
    private int upperBound;
    private int index;
    
    public MyIndexOutOfBoundException(int lowerBound, int upperBound, int index) {
    	this.lowerBound = lowerBound;
    	this.upperBound = upperBound;
    	this.index = index;   	
    }
    
    public String toString() {
    	return "Error Message: Index: " + index + ", but Lower bound: " + 
    			+ lowerBound + ", Upper bound:  " + upperBound;
    }
    
    public static void main(String[] args){
    	List<Integer> list = new ArrayList<>();
    	list.add(1);
    	list.add(2);
    	list.add(3);
    	list.add(4);
    	list.add(5);
    	list.add(6);
    	list.add(7);
    	list.add(8);
    	list.add(9);
    	try {
    		if(list.size() < 10)
    			throw new MyIndexOutOfBoundException(0, list.size(), 10);
    		System.out.println(list.get(10));
    	}finally{
    		
    	}
    	
    }
}
