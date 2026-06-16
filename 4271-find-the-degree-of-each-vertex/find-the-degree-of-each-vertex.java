class Solution {
    public int[] findDegrees(int[][] matrix) {
        int[] ans = new int[matrix.length];
        
        for (int i = 0; i < matrix.length; i++) {
            int sum = 0; // reset for each row
            for (int val : matrix[i]) {
                sum += val;
            }
            ans[i] = sum;
        }
        
        return ans;
    }
}