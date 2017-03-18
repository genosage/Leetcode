public class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        List<Integer> current = new ArrayList<Integer>();
        
        for (int n = 1; n <= numRows; n++) {
            
            current.add(0, 1);
            
            for (int i = 1; i < n - 1; i++) {
                current.set(i, current.get(i) + current.get(i + 1));
            }
            
            result.add(new ArrayList<Integer>(current));
        }
        
        return result;
    }
}