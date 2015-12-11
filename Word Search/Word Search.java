public class Solution {
    public boolean findNear(char[][] board, int[][] markUsed, char[] wordArray, int i, int j, int target){
        markUsed[i][j] = 1;
        if(i > 0 && markUsed[i - 1][j] == 0 && board[i - 1][j] == wordArray[target]){
            if(target == wordArray.length - 1){
                return true;
            }else{
                if(findNear(board, markUsed, wordArray, i - 1, j, target + 1)){
                    return true;
                }
                markUsed[i - 1][j] = 0;
            }
        }
        if(i < board.length - 1 && markUsed[i + 1][j] == 0 && board[i + 1][j] == wordArray[target]){
            if(target == wordArray.length - 1){
                return true;
            }else{
                if(findNear(board, markUsed, wordArray, i + 1, j, target + 1)){
                    return true;
                }
                markUsed[i + 1][j] = 0;
            }
        }
        if(j > 0 && markUsed[i][j - 1] == 0 && board[i][j - 1] == wordArray[target]){
            if(target == wordArray.length - 1){
                return true;
            }else{
                if(findNear(board, markUsed, wordArray, i, j - 1, target + 1)){
                    return true;
                }
                markUsed[i][j - 1] = 0;
            }
        }
        if(j < board[i].length - 1 && markUsed[i][j + 1] == 0 && board[i][j + 1] == wordArray[target]){
            if(target == wordArray.length - 1){
                return true;
            }else{
                if(findNear(board, markUsed, wordArray, i, j + 1, target + 1)){
                    return true;
                }
                markUsed[i][j + 1] = 0;
            }
        }
        return false;
    }
    public boolean exist(char[][] board, String word) {
        char[] wordArray = word.toCharArray();
        int[][] markUsed = new int[board.length][board[0].length];
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[i].length; j++){
                markUsed[i][j] = 0;
            }
        }
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[i].length; j++){
                if(wordArray.length == 1){
                    if (board[i][j] == wordArray[0]){
                        return true;
                    }
                }else if(wordArray.length > 1){
                    if (board[i][j] == wordArray[0]){
                        if(findNear(board, markUsed, wordArray, i, j, 1)){
                            return true;
                        }
                        markUsed[i][j] = 0;
                    }
                }
            }
        }
        return false;
    }
}