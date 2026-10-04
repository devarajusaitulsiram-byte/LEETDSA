class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int count = 0;
        int n = nums.length;
        int i;
        if(n>1){
        for(i =1;i<n;i++){
            if(nums[i]==nums[i-1]){
                count++;
            }if(count>=n/2){
                return nums[i];
            }
        }
        }return nums[0];
    }
}