class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int numss[] = new int[n*2];
        for(int i = 0 ; i<nums.length ; i++ ) {
            numss[i] = nums[i];
            numss[n+i] = nums[i];
        }
        return numss;
    }
}