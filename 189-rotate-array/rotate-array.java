class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
         k = k % n;

        reversee(nums, 0 , n-1);
        reversee(nums, 0 , k-1);
        reversee(nums, k , n-1);
    }
    void reversee(int nums[] , int i , int j){
        while(i<j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }   
    }
}