class Solution {

    public String encode(List<String> strs) {
        String result ="";
        for(String s:strs){
            int c=s.length();
            StringBuilder sb=new StringBuilder();
            sb.append(c);
            sb.append("*");
            sb.append(s);
            result+=sb.toString();
        }
        
        
        return result;
    }

    public List<String> decode(String str) {
    List<String> decodedList = new ArrayList<>();
    int i = 0;

    while (i < str.length()) {
        StringBuilder lengthStr = new StringBuilder();

        
        while (str.charAt(i) != '*') {
            lengthStr.append(str.charAt(i));
            i++;
        }

        i++; 

        int length = Integer.parseInt(lengthStr.toString());

        
        decodedList.add(str.substring(i, i + length));
        i += length;
    }

    return decodedList;
}
}
