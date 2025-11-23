class Solution {
    List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> subsets(int[] nums) {
        List <Integer> ans = new ArrayList<>();
        slove(nums , 0 , ans);
        return result;
    }
    public void slove(int nums[] , int i  ,List<Integer> ans ){
        if(nums.length <= i ){
            result.add(new ArrayList<>(ans) );
            return;
        }
        ans.add(nums[i]);
        slove(nums,i+1,ans);
        ans.remove(ans.size()-1);
        slove(nums,i+1 ,ans);
    }
}