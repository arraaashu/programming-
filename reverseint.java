class Solution {
    public int reverse(int x) {
        long a,b=0;
        a=x;
        if(a<0)
        {
            a=a-(2*a);
        }
        while(a!=0)
        {
            b=(b*10)+(a%10);
            a=a/10;
        }
        if(b==(int)b)
        {
        if(x<0)
        {
            b=b-(2*b);
            return (int)b;
        }
        else
        {
            return (int)b;
        }      
        }
        else{
            return 0;
        }
        }
    }