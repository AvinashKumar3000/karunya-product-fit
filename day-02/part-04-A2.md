# plan

## longest common prefix

```java
class Solution {
    public String longestCommonPrefix(String[] strs) {

        if (strs == null || strs.length == 0) {
            return "";
        }

        String prefix = strs[0];

        for (int i = 0; i < prefix.length(); i++) {
            for (int j = 1; j < strs.length; j++) {
                if (i >= strs[j].length() || strs[j].charAt(i) != prefix.charAt(i)) {
                    return prefix.substring(0, i);
                }
            }
        }
        return prefix;
    }
}

```

## isomorphic string

```java
import java.util.*;

class Solution {
    public boolean isIsomorphic(String s, String t) {
    	if(s.length() != t.length())
    		return true;
    	int[] pattern1 = getPattern(s);
    	int[] pattern2 = getPattern(t);
    	
    	for(int i=0; i<pattern1.length; i++) {
    		if(pattern1[i] != pattern2[i]){ 
    			return false;
    		}
    	}
		return true;    	
    }
    private int[] getPattern(String input) {
    	HashMap<Character, Integer> map = new HashMap<>();
    	int index = 0;
    	int pattern[] = new int[input.length()];
    	int idx = 0; 
    	for(int i=0; i<input.length(); i++) {
    		char ch = input.charAt(i);
    		if(map.containsKey(ch)) {
    			pattern[idx++] = map.get(ch);
    		}else{
    			map.put(ch, index);
    			pattern[idx++] = map.get(ch);
    			index++;
    		}
    	}
    	return pattern;
    }
}

```



```java
import java.util.*;

class Solution {

    public boolean isIsomorphic(String s, String t) {
        List<Integer> p1 = getPattern(s);
        List<Integer> p2 = getPattern(t);

        return p1.equals(p2);
    }

    private List<Integer> getPattern(String val) {
        Map<Character, Integer> map = new HashMap<>();
        List<Integer> pattern = new ArrayList<>();

        int index = 0;

        for (char ch : val.toCharArray()) {
            if (!map.containsKey(ch)) {
                map.put(ch, index);
                index++;
            }
            pattern.add(map.get(ch));
        }

        return pattern;
    }
}
```
