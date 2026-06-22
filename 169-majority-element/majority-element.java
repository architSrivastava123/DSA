class Solution {
    public int majorityElement(int[] nums) {
    //    for(int i = 0 ; i<nums.length ;i++){
    //     int count =0;
    //     for(int j = 0 ; j<nums.length ;j++){
    //         if(nums[i]==nums[j]){
    //             count++;
    //         }
    //     }
    //     if(count>(nums.length/2)){
    //         return nums[i];
    //     }
    //    } 
    //    return 0;
    int ct=0;
    int el = 0;
    for(int i = 0 ; i<nums.length ;i++){
        if(ct==0){
            el=nums[i];
            ct++;
        }
        else if( el == nums[i]){
            ct++;
        }
        else{
            ct--;
        }
    }
     return el;
    }
}