class Solution {
    public int alternateDigitSum(int n) {
        int sum = 0;
        int sign = 1;
        while(n>0){
            int lastdigit = n % 10;
            sum += lastdigit * sign;
            sign = -sign;
            n /= 10;
        }
        return sum * -sign;
    }
}