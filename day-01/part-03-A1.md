# plan

- two sum (https://leetcode.com/problems/two-sum/description/)
- good pairs (https://leetcode.com/problems/number-of-good-pairs/)

```java
// TWO SUM SOLUTION
import java.util.HashMap;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> di = new HashMap<>();

        for(int i=0; i<nums.length; i++) {
            int a = nums[i];
            int b = target - a;
            if(di.containsKey(b)) {
                int res[] = {di.get(b), i};
                return res;
            }
            di.put(a, i);
        } 
        int temp[] = new int[2];
        return temp;
    }
}
```


## GOOd pairs solution 

```java
import java.util.HashMap;
class Solution {
    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer,Integer> di = new HashMap<>();
        int n = nums.length;
        int pairs = 0;
        for(int i=0; i<n; i++) {
            int x = nums[i];
            if( di.containsKey(x) ) {
                int count = di.get(x);
                pairs = pairs + count;
                di.put(x, count + 1 );
            } else {
                di.put(x, 1);
            }
        }
        return pairs;
    }
}
```


