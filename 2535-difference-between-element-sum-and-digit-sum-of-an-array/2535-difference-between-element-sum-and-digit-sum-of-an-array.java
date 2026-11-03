class Solution {
    public int differenceOfSum(int[] nums) {
        int numsSum = 0;
        int digitSum = 0;
        for(int i = 0; i < nums.length;i++){
            numsSum = numsSum + nums[i];
            int n = nums[i];
            while(n>0){
                int lastdigit = n%10;
                digitSum = digitSum + lastdigit;
                n = n/10;
            } 
        }
        return numsSum-digitSum;
    }
}