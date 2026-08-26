package LeetCode;

class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        int n=s.length();
        int ones=0;
        int l=0;
        String ans = "";
        for (int i=0;i<n;i++){
            if (s.charAt(i)=='1'){
                ones++;
            }
            while(ones>k){
                if (s.charAt(i)=='1'){
                    l++;
                    ones--;
                }
            }
            if (ones==k){
                while (l<i && s.charAt(l)=='0'){
                    l++;
                }
                String current = s.substring(l,i+1);
                if (ans.isEmpty() || current.length()<ans.length() || (current.length()==ans.length() && current.compareTo(ans)<0) ){
                    ans = current;
                }
            }
        }
        return ans;
    }
}