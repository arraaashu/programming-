class Solution {
    public String reverseWords(String s) {
        char[] r=new char[s.length()];
        int j=s.length();
        char[] s1=s.toCharArray();
        for(int i=0;i<s.length();i++)
            {
                r[j-1]=s1[i];
            j=j-1;
            }
        String r1=String.valueOf(r);
        return r1; 
    }
}