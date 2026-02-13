# plan

## trapping rain water problem

```java
class Solution {
    public int trap(int[] h) {
        int n = h.length;
        int water = 0;
        int l = 0, r = n-1;
        int lm = 0, rm = 0;
        while ( l <= r ) {
            if( lm <= rm ){
                if (h[l] >=  lm)
                    lm = h[l];
                else
                    water += ( lm - h[l]);
                l+=1;
            } else {
                if (h[r] >= rm)
                    rm = h[r];
                else
                    water += ( rm - h[r] );
                r-=1;
            }
        }
        return water;
    }
}
```
