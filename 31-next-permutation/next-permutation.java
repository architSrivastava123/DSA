class Solution {
    public void reverse(int arr[], int i , int j){
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    public void nextPermutation(int[] nums) {
        int index= -1;
        for(int i=nums.length-2 ; i>=0;i--){
            if(nums[i]<nums[i+1]){
                index = i;
                break;
            }
        }
        if(index == -1){
            reverse(nums,0,nums.length-1);
            return;
        }
        for(int i = nums.length-1 ; i>=0;i--){
            if(nums[i]>nums[index]){
                int temp = nums[i];
                nums[i] = nums[index];
                nums[index] = temp;
                break;
            }
        }
        reverse(nums , index+1 , nums.length-1);
    }
}