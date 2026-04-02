class Solution {

    private boolean isana(String s, String t) {
        if (s.length() != t.length()) return false;
        int[] arr = new int[26];
        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'a']++;
            arr[t.charAt(i) - 'a']--;
        }
        for (int val : arr) {
            if (val != 0) return false;
        }
        return true;
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        int[] arr = new int[strs.length];
        List<List<String>> lst=new ArrayList<>();
        for(int i=0;i<strs.length;i++){
            String s1=strs[i];
            if(arr[i]==1) continue;
            arr[i]=1;
            List<String> lst1=new ArrayList<>();
            lst1.add(s1);
            for(int j=0;j<strs.length;j++){
                if(arr[j]==1) continue;
                if(isana(s1,strs[j])){
                    lst1.add(strs[j]);
                    arr[j]=1;
                    


                }

            }
            lst.add(lst1);
        }
        return lst;
    }
}
