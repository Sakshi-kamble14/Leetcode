class Solution {
    public int maxProfit(int[] prices) {
        int bp=prices[0];
        int pro=0;

        for(int i=1;i<prices.length;i++){
            if(bp>prices[i])
              bp=prices[i];

            pro=Math.max(pro,prices[i]-bp);
        }
        return pro;
    }
}