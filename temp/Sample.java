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
