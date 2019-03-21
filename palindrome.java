class Solution {
    public boolean isPalindrome(int x) {
        long a,b=0;
        a=x;
        while(a!=0)
        {
            b=(b*10)+(a%10);
            a=a/10;
        }
   
        if(((x%10==0)&&(x!=0))||(x<0))
        {
            return false;
        }
        if(x==(int)b)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}