class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxwindow=0;
        HashSet<Character> str=new HashSet<>();
        int left=0;
        for(int i=0;i<s.length();i++){
            while(str.contains(s.charAt(i))){
                str.remove(s.charAt(left));
                left++;
            }
            str.add(s.charAt(i));
            maxwindow=Math.max(maxwindow,i-left+1);
        }
        return maxwindow;
        
    }
}
