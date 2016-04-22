public class Solution {
    public int[] plusOne(int[] digits) {
        if(digits == null || digits.length == 0) {
            return null;
        }
        
        for(int i = digits.length - 1; i >= 0 ; i--) {
            if(digits[i] == 9){
                if(i == 0) {
                    int[] result = new int[digits.length + 1];
                    result[0] = 1;
                    for (int j = 1; j < result.length; j++) {
                        result[j] = 0;
                    }
                    return result;
                } else {
                    digits[i] = 0;
                }
            }else {
                digits[i] += 1;
                break;
            }
        }
        
        return digits;
    }
}