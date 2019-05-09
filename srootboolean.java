class Solution {
    public boolean isPerfectSquare(int num) {
        double s=Math.sqrt(num);
        int sq=(int)s;
        if(s%sq==0)
            return true;
        else
            return false;
    }
}