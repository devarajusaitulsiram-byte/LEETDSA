class Solution {
    public String reverse(String a){
        String ans ="";
        for(int i =a.length()-1;i>=0;i--){
            ans+=a.charAt(i);
        }return ans;

    }
    public int maximumNumberOfStringPairs(String[] words) {
        int ans = 0;
        for(int i = 0;i<words.length;i++){
            for(int j =i+1;j<words.length;j++){
                String a = words[i];
                String b = words[j];
                if(!b.equals("0")){
                    String revt = reverse(b);
                if(a.equals(revt)){
                    ans++;
                    words[j]="0";
                    break;
                }
            }
            }
        }return ans;
    }
}