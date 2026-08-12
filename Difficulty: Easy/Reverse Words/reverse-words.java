class Solution {
    public String reverseWords(String s) {
        // Code here
        String str[]=s.split("\\.");
        
        StringBuilder sb=new StringBuilder();
        boolean first=true;
        
        for(int i=str.length-1;i>=0;i--)
        {
            if(str[i].isEmpty())
            {
                continue;
            }
            if(!first)
            {
                sb.append(".");
            }
            sb.append(str[i]);
            first=false;
        }
        return sb.toString();
    }
}
