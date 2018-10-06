package reverse;

public class ReverseString {
	
	public String reverse(String string) {
		string = string.trim();
		StringBuilder result = new StringBuilder();
		boolean space = false;
		int i;
		for(i = 0; i < string.length(); i++) {
			if(string.charAt(i)!=' ') {
				space =false;
				result.append(string.charAt(i));
			}
		}
	        if(!space) {
			space = true;
			result.append(string.charAt(i));
		}
	        
	    String[] s = string.split(" ");
	    for(int j = s.length - 1; j >0; j--) {
	    	System.out.print(s[j] + " ");
	    }
	    System.out.print(s[0]);
	}


}
