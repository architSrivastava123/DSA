class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int ans[] = new int [n];
        int j =0;
        int m =1;
        for(int i = 0 ; i<n ; i++){
            if(nums[i]>0){
                ans[j] = nums[i]; 
                j = j+2;
            }
            else{
                ans[m] = nums[i];
                m= m+2;
            }

        }
        return ans;
    }
}