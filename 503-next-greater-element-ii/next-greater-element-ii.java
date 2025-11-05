class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n =nums.length;
        int arr[]= new int[n];
        Arrays.fill(arr, -1);
        Deque<Integer> stack = new ArrayDeque<>();
        for (int i = 0; i < n * 2; i++) {
        int num = nums[i % n];
        while (!stack.isEmpty() && nums[stack.peek()] < num){
            arr[stack.pop()] = num;
        } 
        if (i < n){
            stack.push(i);
        }
    }
     return arr;
  }
}