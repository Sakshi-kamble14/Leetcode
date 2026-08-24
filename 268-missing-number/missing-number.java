class Solution {
    public int missingNumber(int[] nums) {
        int sum=0,actualsum=0;

        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
       actualsum=(nums.length*(nums.length+1))/2;

       return actualsum-sum;

    }
}