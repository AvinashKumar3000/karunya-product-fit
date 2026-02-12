# plan

## LC_36 valid sudoku

```java
class Solution {
    public boolean isValidSudoku(char[][] board) {
        boolean rows[][] = new boolean[9][9];
        boolean cols[][] = new boolean[9][9];
        boolean boxes[][] = new boolean[9][9];

        int rc = board.length;
        int cc = board[0].length;

        for (int i = 0; i < rc; i++) {
            for (int j = 0; j < cc; j++) {
                int r = i;
                int c = j;
                if (board[i][j] == '.')
                    continue;
                int value = board[i][j] - 49;
                int box_index = (r / 3) * 3 + (c / 3) + 1 - 1;
                if (rows[r][value] || cols[c][value] || boxes[box_index][value])
                    return false;
                
                rows[r][value] = true;
                cols[c][value] = true;
                boxes[box_index][value] = true;
            }
        }
        return true;
    }
}
```


```java
class Solution {
    public boolean isValidSudoku(char[][] board) {

        boolean[][] rows = new boolean[9][9];
        boolean[][] cols = new boolean[9][9];
        boolean[][] boxes = new boolean[9][9];

        for (int r = 0; r < 9; r++) {
            for (int c = 0; c < 9; c++) {

                if (board[r][c] == '.') continue;

                int num = board[r][c] - '1';   // convert char to 0–8
                int boxIndex = (r / 3) * 3 + (c / 3);

                if (rows[r][num] || cols[c][num] || boxes[boxIndex][num]) {
                    return false;
                }

                rows[r][num] = true;
                cols[c][num] = true;
                boxes[boxIndex][num] = true;
            }
        }

        return true;
    }
}
```


## LC_169 majority element

```java
class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        candidate = None
        count = 0
        for i in range(len(nums)):
            if count == 0:
                candidate = nums[i]
            if candidate == nums[i]:
                count +=1
            else:
                count -=1
        return candidate
```
