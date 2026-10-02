class Solution {
    public int[] runningSum(int[] nums) {
        int n = nums.length;
        int arr[] = new int[n];
        int temp =0;
        for(int i = 0;i<n;i++){
            if(i==0){
                nums[i] = nums[0];
            }else if(i>0){
                temp = nums[i] + nums[i-1];
                nums[i] = temp;
            }
        }return nums;
    }
}