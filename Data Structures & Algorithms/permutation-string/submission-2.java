class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n=s1.length();
        int m=s2.length();
        if(n>m){
            return false;
        }
        int need[]=new int[26];
        int win[] = new int[26];
        for(int i=0;i<n;i++){
            need[s1.charAt(i)-'a']++;
            win[s2.charAt(i)-'a']++;
        }
        if(is_same(need,win)) return true;
        for(int r=n;r<m;r++){
            win[s2.charAt(r)-'a']++;
            win[s2.charAt(r-n)-'a']--;
            if(is_same(need,win)) return true;
        }
        return false;
        
    }
    private boolean is_same(int[]need,int[]win){
        for(int i=0;i<26;i++){
            if(need[i]!=win[i]){
                return false;
            }
        }
        return true;
    }
}
