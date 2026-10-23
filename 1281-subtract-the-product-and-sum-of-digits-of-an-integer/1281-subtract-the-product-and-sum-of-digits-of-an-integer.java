class Solution {
    public int subtractProductAndSum(int n) {
        int sum = 0;
        int mul = 1;

        while(n>0){
            int lastdigit = n%10;
            sum += lastdigit;
            mul = mul * lastdigit;
            n = n/10;
        }
        return mul - sum;
    }
}