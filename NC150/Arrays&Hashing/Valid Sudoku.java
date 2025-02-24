Date : 18.02.24
class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> seen = new HashSet<>();

        for (int i = 0; i < 9; i++) {  // Iterate over rows
            for (int j = 0; j < 9; j++) {  // Iterate over columns
                char num = board[i][j];

                if (num != '.') {  // Ignore empty cells
                    // Row check
                    if (!seen.add(num + " in row " + i)) return false;
                    // Column check
                    if (!seen.add(num + " in col " + j)) return false;
                    // Sub-grid (3x3 box) check
                    if (!seen.add(num + " in box " + (i / 3) + "-" + (j / 3))) return false;
                }
            }
        }
        return true;  // If no duplicates found, return true
    }
}
