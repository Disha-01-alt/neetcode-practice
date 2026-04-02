class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n=s1.length();
        int m=s2.length();
        if(n>m){
            return false;
        }
        String window=s2.substring(0,n);
        for(int i=0; i<m;i++){
            if(!(is_anagram(window,s1))){
                if((n+i)<=m){
                window=s2.substring(i,n+i);
                }
                else{
                    return false;
                }
            }
            else{
                return true;
            }
        }
        return false;  
        
    }
    private boolean is_anagram(String s1, String s2){
        if(s1.length()!=s2.length()){
            return false;
        }
        int arr[]=new int[26];
        for(int i=0;i<s1.length();i++){
            arr[s1.charAt(i)-'a']++;
            arr[s2.charAt(i)-'a']--;

        }
        for(int val: arr){
            if(val!=0){
                return false;
            }
        }
        return true;
    }
}
