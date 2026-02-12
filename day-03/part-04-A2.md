# plan

## LC_496 next greater element 1

```java
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int result[] = new int[nums1.length];
        Stack<Integer> stack = new Stack<Integer>();
        HashMap<Integer,Integer> hashMap = new HashMap<Integer,Integer>(); 
        
        for(int j=0; j<nums2.length; j++) {
            while( !stack.isEmpty() && nums2[j] > stack.peek() ) {
                int top = stack.peek();
                hashMap.put(top,nums2[j]);
                stack.pop();   
            }
            stack.push(nums2[j]);
        }

        while(!stack.isEmpty()) {
            int top = stack.peek();
            stack.pop();
            hashMap.put(top,-1);
        }

        for(int i=0; i<nums1.length; i++) {
            if(hashMap.containsKey(nums1[i]))
            {
                int val = hashMap.get(nums1[i]);
                result[i] = val;
            }
        }
        return result;
    }
}
```
