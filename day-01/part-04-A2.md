# plan

- no of inter changeable rectangle (https://leetcode.com/problems/number-of-pairs-of-interchangeable-rectangles/)

```java
import java.util.HashMap;

class Solution {
    public long interchangeableRectangles(int[][] rectangles) {
        HashMap<Double, Integer> di = new HashMap<>();
        int n = rectangles.length;
        long pairs = 0;
        for(int i=0; i<n; i++) {
            double w = (double) rectangles[i][0];
            double h = (double) rectangles[i][1];
            double r = w/h;
            if( di.containsKey(r) ){
                int count = di.get(r);
                pairs = pairs + count;
                di.put(r, count + 1);
            } else {
                di.put(r, 1);
            }
        }
        return pairs;
    }
}
```
