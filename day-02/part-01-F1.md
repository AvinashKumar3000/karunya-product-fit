# plan

## anagram all approaches

## group anagram

## LC_242. Valid Anagram

```java
class Solution {
    public boolean isAnagram(String s, String t) {
         int freq[] = new int[26];
         for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            freq[ch-'a']++;
         }
         for(int i=0; i<t.length(); i++){
            char ch = t.charAt(i);
            freq[ch-'a']--;
         }
         for(int i=0; i<26; i++) {
            if (freq[i]!=0)
                return false;
         }
         return true;
    }
}
```

## LC_49 Group anagram

```python
class Solution:
    def groupAnagrams(self, strs):
        di = {}

        for word in strs:
            sorted_word = "".join(sorted(word))
            if sorted_word in di:
                di[sorted_word].append(word)
            else:
                di[sorted_word] = [ word ]

        li = []
        for key in di:
            li.append(di[key])
        return li
```

```java
import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> di = new HashMap<>();

        for (String word : strs) {
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String sortedWord = new String(chars);

            if (di.containsKey(sortedWord)) {
                di.get(sortedWord).add(word);
            } else {
                List<String> list = new ArrayList<>();
                list.add(word);
                di.put(sortedWord, list);
            }
        }
        List<List<String>> result = new ArrayList<>();
        for (String key : di.keySet()) {
            result.add(di.get(key));
        }
        return result;
    }
}
```
