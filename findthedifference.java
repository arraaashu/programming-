class Solution {
    public char findTheDifference(String s, String t) {
        int sum=0;
        int sumt=0;
        char[] cs=s.toCharArray();
        char[] ct=t.toCharArray();
        for(int i=0;i<cs.length;i++)
        {
            sum+=cs[i];
        }
        for(int i=0;i<ct.length;i++)
        {
            sumt+=ct[i];
        }
        return (char)(sumt-sum);
    }
}