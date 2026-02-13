# plan

## longest histogram rectangle

```java
class Solution {
    public int largestRectangleArea(int[] heights) {
        int maxArea = 0;
        int n = heights.length;

        // For each bar as the shortest bar
        for (int i = 0; i < n; i++) {
            int height = heights[i];
            int left = i;
            int right = i;

            // Expand left until hitting a smaller bar
            while (left > 0 && heights[left - 1] >= height) {
                left--;
            }

            // Expand right until hitting a smaller bar
            while (right < n - 1 && heights[right + 1] >= height) {
                right++;
            }

            // Area with the current bar as the limiting height
            int width = right - left + 1;
            int area = height * width;
            maxArea = Math.max(maxArea, area);
        }

        return maxArea;
    }
}

```

```java

```

