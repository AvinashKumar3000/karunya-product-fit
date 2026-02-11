# plan

## LC_13 roman to integer

```java
import java.util.*;

class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        int total = 0;
        for(int i=0; i<s.length() - 1; i++) {
            char curr_ch = s.charAt(i);
            char next_ch = s.charAt(i+1);
            if(map.get(curr_ch) < map.get(next_ch)) {
                total -= map.get(curr_ch);
            }else{
                total += map.get(curr_ch);
            }
        }
        char last_ch = s.charAt(s.length() - 1);
        total = total + map.get(last_ch);
        return total;
    }
}
```

## LC_12 integer to roman

```java
class Solution {
    public String intToRoman(int num) {
        int[] values = {
            1000, 900, 500, 400,
            100, 90, 50, 40,
            10, 9, 5, 4, 1
        };

        String[] symbols = {
            "M", "CM", "D", "CD",
            "C", "XC", "L", "XL",
            "X", "IX", "V", "IV", "I"
        };

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < values.length; i++) {
            while (num >= values[i]) {
                result.append(symbols[i]);
                num -= values[i];
            }
        }

        return result.toString();
    }
}
```
