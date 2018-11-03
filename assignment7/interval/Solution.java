package interval;

import java.util.ArrayList;
import java.util.Arrays;


public class Solution {
	    public List<Interval> merge(List<Interval> intervals) {
	       if(intervals.size() == 0 || intervals.size() == 1)
	    	   return intervals; 
	       int[] start = new int[intervals.size()];
	       int[] end = new int[intervals.size()];
	       
	       Arrays.sort(start);
	       Arrays.sort(end);
	       java.util.List<Interval> sol = new ArrayList<Interval>();
	       
	       for(int i =0, j = 0; i < intervals.size(); i++) {
	    	   if(i == intervals.size() || start[i + 1] > end[i]) {
	    		   sol.add(new Interval(start[j],end[i]));
	    		   j = i + 1;
	    		   
	    	   }
	       }
	  
	    return sol;
	    }
}
