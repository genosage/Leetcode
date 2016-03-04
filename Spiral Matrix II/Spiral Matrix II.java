public class Solution {
    public int[][] generateMatrix(int n) {
        int[][] M = new int[n][n];
        
        if(n <= 0){
            return M;
        }
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                M[i][j] = 0;
            }
        }
        
        for(int i = 1, a = 0, b = 0; i <= n * n; i++){
            M[a][b] = i;
            
            if(a == 0 && b < n -1){
                b++;
            }
            
            else if(a == 0 && b == n - 1){
                a++;
            }
            
            else if(b < n - 1 && M[a][b + 1] == 0 && M[a - 1][b] != 0){
                b++;
            }
            
            else if(a < n - 1 && M[a + 1][b] == 0){
                a++;
            }
            
            else if(b > 0 && M[a][b - 1] == 0){
                b--;
            }
            
            else if(a > 0 && M[a - 1][b] == 0){
                a--;
            }
        }
        
        return M;
    }
}