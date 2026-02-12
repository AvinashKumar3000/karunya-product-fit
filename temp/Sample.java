import java.util.*;

class Solution {
    public boolean isIsomorphic(String s, String t) {
    	String pattern1 = getPattern(s);
    	String pattern2 = getPattern(t);
    	System.out.println(pattern1);
    	System.out.println(pattern2);
    	if( pattern1.equals(pattern2)){
    	    return true;
    	} else {
    		return false;
    	}
    }
    private String getPattern(String input) {
    	HashMap<Character, Integer> map = new HashMap<>();
    	ArrayList<Integer> arr = new  ArrayList<>();
    	int index = 0;
        System.out.println(map.toString());
    	for(int i=0; i<input.length(); i++) {
    		char ch = input.charAt(i);
    		if(map.containsKey(ch)) {
    			String.valueOf(map.get(ch));
    		}else{
    			map.put(ch, index);
    			pattern = pattern + String.valueOf(map.get(ch));
    			index++;
    		}
    	}
    	return pattern;
    }
}
