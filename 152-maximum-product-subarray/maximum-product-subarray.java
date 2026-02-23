class Solution {
    public int maxProduct(int[] nums) {
        int c= 1;
        int max=Integer.MIN_VALUE;
        for(int i=0; i<nums.length;i++){
            c*= nums[i];
            max = Math.max(c,max);
            if(c==0){
                c=1;
            }
        }
        c=1;
        for(int i=nums.length-1; i>=0;i--){
            c*= nums[i];
            max = Math.max(c,max);
            if(c==0){
                c=1;
            }
        }
        return max;
    }
}