public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int low = 0, high = matrix.length - 1, medium = 0;
        int mark = 0;
        
        while(low <= high) {
            medium = (low + high) / 2;
            if(matrix[medium][0] == target) {
                return true;
            }
            else if(matrix[medium][0] > target) {
                high = medium - 1;
            }
            else {
                low = medium + 1;
            }
        }
        
        if(high >= 0){
            mark = high;
            low = 0;
            high = matrix[0].length - 1;
            
            while(low <= high) {
                medium = (low + high) / 2;
                if(matrix[mark][medium] == target) {
                    return true;
                }
                else if(matrix[mark][medium] > target) {
                    high = medium - 1;
                }
                else {
                    low = medium + 1;
                }
            }
        }
        
        return false;
    }
}