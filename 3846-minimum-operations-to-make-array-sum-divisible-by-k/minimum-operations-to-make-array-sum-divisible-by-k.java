class Solution {
    public int minOperations(int[] nums, int k) {
        int sum=0;
        for(int arr:nums)   
            sum+=arr;
        return sum%k;
    }
}