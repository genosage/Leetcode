public class Solution {
    public void gameOfLife(int[][] board) {
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[0].length; j++) {
                if(board[i][j] == 1) {
                    board[i][j] = 10 + liveNum(board, i, j);
                }
                else {
                    board[i][j] = -10 - liveNum(board, i, j);
                }
            }
        }
        
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[0].length; j++) {
                if(board[i][j] == 12 || board[i][j] == 13 || board[i][j] == -13) {
                    board[i][j] = 1;
                }
                else {
                    board[i][j] = 0;
                }
            }
        }
    }
    
    public int liveNum(int[][] board, int i, int j) {
        int num = 0;
        
        for(int a = i - 1; a <= i + 1; a++) {
            for(int b = j - 1; b <= j + 1; b++) {
                if(a >= 0 && a < board.length && b >= 0 && b < board[0].length) {
                    num = board[a][b] > 0 ? ++num : num;
                }
            }
        }
        
        num = board[i][j] > 0 ? --num : num;
        return num;
    }
}