class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxwindow=0;
        for(int i=0;i<s.length();i++){
            HashSet<Character> st=new HashSet<>();
            for(int j=i;j<s.length();j++){
                char temp=s.charAt(j);
                if(st.contains(temp)){
                    break;
                }
                st.add(temp);
                maxwindow=Math.max(maxwindow,j-i+1);
            }
        }
        return maxwindow;
        
    }
}
