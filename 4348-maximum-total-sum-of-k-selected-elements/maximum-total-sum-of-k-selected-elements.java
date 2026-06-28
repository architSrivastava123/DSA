class Solution {
    public long maxSum(int[] nums, int k, int mul) {
        Arrays.sort(nums);
        long total = 0;
        
        for(int i=nums.length-1; i>=nums.length-k; i--){
            int weight = Math.max(1, mul);

            total += (long) nums[i]*weight;
            mul--;
        }
        return total;
    }
}