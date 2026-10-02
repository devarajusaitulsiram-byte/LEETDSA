class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int arr1[] = new int[2*n];
        for(int i = 0 ;i<2*n;i++){
            if(i<n){
                arr1[i] = nums[i];
            }else if(i>=n){
                arr1[i] = nums[i-n];
            }
        }return arr1;
    }
}