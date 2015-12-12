public class Solution {
    public boolean match(char[][] board, int[][] markUsed, char[] wordArray, int i, int j, int target) {

        if (i < 0 || i > board.length - 1 || j < 0 || j > board[0].length - 1) {
            return false;
        }

        if (markUsed[i][j] == 0 && board[i][j] == wordArray[target]) {

            if (target == wordArray.length - 1) {
                return true;
            }

            markUsed[i][j] = 1;

            if (match(board, markUsed, wordArray, i - 1, j, target + 1)) {
                return true;
            }
            if (match(board, markUsed, wordArray, i + 1, j, target + 1)) {
                return true;
            }
            if (match(board, markUsed, wordArray, i, j - 1, target + 1)) {
                return true;
            }
            if (match(board, markUsed, wordArray, i, j + 1, target + 1)) {
                return true;
            }
            
            markUsed[i][j] = 0;
        }
        return false;
    }

    public boolean exist(char[][] board, String word) {
        char[] wordArray = word.toCharArray();
        int[][] markUsed = new int[board.length][board[0].length];

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                markUsed[i][j] = 0;
            }
        }

        if (board == null) {
            return false;
        }
        if (word == null || word.length() == 0) {
            return false;
        }

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                    if (match(board, markUsed, wordArray, i, j, 0)) {
                        return true;
                    }
            }
        }
        return false;
    }
}