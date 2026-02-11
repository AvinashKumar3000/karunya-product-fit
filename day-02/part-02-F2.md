# plan

## LC_771 jewels and stones

```java
class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        for(int i=0; i<stones.length(); i++) {
            char stone = stones.charAt(i);
            for(int j=0; j<jewels.length(); j++) {
                char jewel = jewels.charAt(j);
                if(stone == jewel) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }
}
```


## ransom notes

```java
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int freq[] = new int[26];

        int rc = ransomNote.length();
        int mc = magazine.length();

        for(int i=0; i<mc; i++) {
            char ch = magazine.charAt(i);
            freq[ch-'a']++;
        }
        for(int i=0; i<rc; i++) {
            char ch = ransomNote.charAt(i);
            freq[ch-'a']--;
            if(freq[ch-'a']<0) {
                return false;
            }
        }
        return true;
    }
}
```
