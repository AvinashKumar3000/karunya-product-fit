# plan

## Next greater element 2

```java

class Solution {
    public int[] nextGreaterElements(int[] nums) {
         int n = nums.length;
         int res[] = new int[n];
         int k = 0;
         for(int i=0; i<n; i++) {
         	int max_value = -1;
         	for(int j=i+1; j<i+n+1; j++) {
         		int idx = j%n;
         		if(nums[idx] > nums[i]) {
         			max_value = nums[idx];
         			break;
         		}
         	}
         	res[k++] = max_value;
         }
         return res;
    }
}

```


```java
class Solution {
    public int[] nextGreaterElements(int[] nums) {
            int n = nums.length;
            int result[] = new int[nums.length];
            Stack<Integer> stack = new Stack<Integer>();
            
            for(int i=0; i<n; i++) {
                result[i] = -1;
            }


            for(int i=0; i<(2*n); i++) {
                int curr = nums[i%n];
                while( !stack.isEmpty() && nums[stack.peek()] < curr ) {
                    int idx = stack.peek();
                    result[idx] = curr;
                    stack.pop();   
                }
                if(i<n)
                    stack.push(i);
            }

            return result;
    }
}
```


## daily temperature

```java
import java.util.Stack;

class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        
        int n = temperatures.length;
        int[] result = new int[n];
        
        Stack<Integer> stack = new Stack<>(); // stores indices
        
        for (int i = 0; i < n; i++) {
            // While current temperature is greater than
            // temperature at index on top of stack
            while (!stack.isEmpty() && 
                   temperatures[i] > temperatures[stack.peek()]) {
                
                int prevIndex = stack.pop();
                result[prevIndex] = i - prevIndex;
            }
            
            stack.push(i);
        }
        
        return result;
    }
}

```
