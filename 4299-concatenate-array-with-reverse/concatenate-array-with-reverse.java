class Solution {
    public int[] concatWithReverse(int[] nums) {
        int []ans=new int[2*nums.length];
        for(int i=0,j=ans.length-1;i<nums.length;++i,--j){
                ans[i]=nums[i];
                ans[j]=nums[i];
        }
        return ans;
    }
}