class Solution {
    List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        solve(nums, 0, new ArrayList<>());
        return result;
    }

    private void solve(int[] nums, int index, List<Integer> current) {
        result.add(new ArrayList<>(current));

        for (int i = index; i < nums.length; i++) {
            if (i > index && nums[i] == nums[i - 1]) 
                continue;
            current.add(nums[i]);
            solve(nums, i + 1, current);
            current.remove(current.size() - 1);
        }
    }
}
