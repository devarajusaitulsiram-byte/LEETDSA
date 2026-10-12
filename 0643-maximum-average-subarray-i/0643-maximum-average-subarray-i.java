class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum = 0;
        double temp;
        int n = nums.length;
        for(int i =0;i<k;i++){
            sum +=nums[i];
        }
        double max = sum;
        if(n==1){
                return nums[0]/1;
            }
        for (int i = k; i < n; i++) {
            sum += nums[i] - nums[i - k];  
            max = Math.max(max, sum);
        }return max/k;
    }
}