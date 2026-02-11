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
