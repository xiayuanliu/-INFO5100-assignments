public class Assignment4 {
	
	/**
	 * The deadline of assignment4 is 10/12/2018 23:59 PST.
	 * Please feel free to contact Zane and Amanda for any questions.
	 */
	
	/*
	 * Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.
	 * s = "leetcode" return 0. 
	 * s = "loveleetcode" return 2.
	 */
    public int firstUniqChar(String s) {
    	char[] ss = s.toCharArray();
		int count[26] = {0};
		
		for(int i = 0; i < ss.length(); i++){
			count[ss[i]- 'a']++;
		}
		for(int i = 0; i < 26; i++){
			if(counter[s[i] - 'a'] == 1)
				return i;
		}
		return -1;
     }
    
    /*
     *Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.
     * Input: 38 Output: 2
     * Explanation: The process is like: 3 + 8 = 11, 1 + 1 = 2. Since 2 has only one digit, return it.
     */
    public int addDigits(int n) {
    	int output = n;
		while(true){
			if(output < 10)
				return output;
			else
				output = output/10 + output%10;
			
		}
    }
    
    /*
     *  Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.
     *  Input: [0,1,0,3,12] Output: [1,3,12,0,0]
     */
    public void moveZeroes(int[] nums) {
    	int temp;
        for(int i = 0; i < nums.length -1; i++){
			for(int j = i + 1; j < nums.length; j++){
				if(nums[i] == 0){
					temp = nums[i];
					nums[i] = nums[j];
					num[j] = temp;
				}
			}
		}
     }
	
    /*
     * Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.
     * Input: "babad" Output: "bab" Note: "aba" is also a valid answer.
     */
	public String longestPalindrome(String s) {
		int len = s.length();
		String ret = "";
		int mid = len / 2;
		int i = 0;
		if(s == null || len ==1){
			return s;
		}
		public String palindorme1(String s, int index){
		String ret = "";
		int i = index, j = index;
		while(i >= 0 && j < s.length()){
			if(s.charAt(i) != s.charAt(j)){
				break;
			}
			ret = s.substring(i, j+1);
			i--;
			j++;
		}
		return ret;
		}
		public String palindorme2(String s, int index){
		String ret = "";
		int i = index, j = index + 1;
		while(i >= 0 && j < s.length()){
			if(s.charAt(i) != s.charAt(j)){
				break;
			}
			ret = s.substring(i, j+1);
			i--;
			j++;
		}
		return ret;
		}
		
		while(true){
			if((len - (mid + i))*2 < ret.length() && (mid - i + 1) < ret.length(){
				break;
			}
			String s1 = palindorme1(s, mid + i);
			String s2 = palindorme2(s, mid + i);
			String s3 = palindorme1(s, mid - i);
			String s2 = palindorme2(s, mid - i);
			if(s1.length() > ret.length()){
				ret = s1;
			}
			if(s2.length() > ret.length()){
				ret = s2;
			}
			if(s3.length() > ret.length()){
				ret = s3;
			}
			if(s4.length() > ret.length()){
				ret = s4;
			}
			i++
		
		}
		return ret;
    }
	
    /*
     * You are given an n x n 2D matrix representing an image. Rotate the image by 90 degrees (clockwise).
     * Given input matrix = [ [1,2,3],
  			      [4,5,6],
  			      [7,8,9] ],
     * rotate the input matrix in-place such that it becomes: [  [7,4,1],
  								 [8,5,2],
  								  [9,6,3] ],
     */
    public int[][] rotate(int[][] matrix) {
    		int n = matrix.length;
			int[][] newmatrix = new int[n][n];
			for(int i = 0; i < n; i++){
				for(int j = 0; j < n; j++){
					newmatrix[i][j] = matrix[n-1-j][i];
				}
			return newmatrix;
			}
   }
    
}
