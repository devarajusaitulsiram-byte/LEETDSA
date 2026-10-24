class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        String s2 = "";
        for(int i =0;i<s.length();i++){
            if(s.charAt(i)>='a'&&s.charAt(i)<='z'||s.charAt(i)>='0'&&s.charAt(i)<='9'){
                s2 = s2+s.charAt(i);
            }}
            int left =0;
            int right  = s2.length()-1;
            int n = s2.length();
            while(left<right){
                if(s2.charAt(left)!=s2.charAt(right)){
                    return false;
                }
                left++;
                right--;
            }
            return true;
            
        
    }
}