# plan

## LC_20 valid parenthesis

```java
import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        
        Stack<Character> stack = new Stack<>();
        
        for (char ch : s.toCharArray()) {
            
            // If opening bracket → push
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } 
            else {
                // If stack empty → invalid
                if (stack.isEmpty()) {
                    return false;
                }
                
                char top = stack.pop();
                
                // Check matching pair
                if (ch == ')' && top != '(') return false;
                if (ch == '}' && top != '{') return false;
                if (ch == ']' && top != '[') return false;
            }
        }
        
        // If stack empty → valid
        return stack.isEmpty();
    }
}
```
