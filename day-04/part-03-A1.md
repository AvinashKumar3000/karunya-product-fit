# plan

## Evaluate reverse polish notation

```java
import java.util.Stack;

class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for (String token : tokens) {

            // If operator
            if (token.equals("+") || token.equals("-") || 
                token.equals("*") || token.equals("/")) {

                int b = stack.pop();  // second operand
                int a = stack.pop();  // first operand

                int result = 0;

                if (token.equals("+")) {
                    result = a + b;
                } 
                else if (token.equals("-")) {
                    result = a - b;
                } 
                else if (token.equals("*")) {
                    result = a * b;
                } 
                else {  // division
                    result = a / b;   // Java auto truncates toward zero
                }

                stack.push(result);
            } 
            else {
                // It's a number
                stack.push(Integer.parseInt(token));
            }
        }

        return stack.pop();
    }
}

```


## simplify path

```java
import java.util.*;

class Solution {
    public String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
        
        // Split by "/"
        String[] parts = path.split("/");
        
        for (String part : parts) {
            
            if (part.equals("") || part.equals(".")) {
                continue;  // Ignore empty and current directory
            }
            
            else if (part.equals("..")) {
                if (!stack.isEmpty()) {
                    stack.pop();  // Go back one directory
                }
            }
            
            else {
                stack.push(part);  // Normal directory
            }
        }
        
        // Build final path
        StringBuilder result = new StringBuilder();
        
        for (String dir : stack) {
            result.append("/").append(dir);
        }
        
        return result.length() == 0 ? "/" : result.toString();
    }
}

```