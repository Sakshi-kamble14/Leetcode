class Solution {
    public int reverseBits(int n) {
        int res=0,bit;
        for(int shift=31;shift>=0;shift=shift-1){
            bit=n&1;// to get LSB
            res+=bit<<shift; // shift left
            n=n>>1;// right shift
        }
        return res;
    }
}