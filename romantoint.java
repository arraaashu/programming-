class Solution {
    public int romanToInt(String s) {
        String ro = "IVXLCDM";
        int[] num = {1, 5, 10, 50, 100, 500, 1000};
        int lastIndex = 0;
        int sum = 0;

        for (int i = 0; i < s.length(); i++) {
            int nowIndex = ro.indexOf(s.charAt(i));
            if (lastIndex < nowIndex && i > 0) {
                sum = sum - 2 * num[lastIndex];
            }
            sum = sum + num[nowIndex];
            lastIndex = nowIndex;
        }
        return sum;
        
    }
}