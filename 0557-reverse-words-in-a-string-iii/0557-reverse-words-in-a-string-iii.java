class Solution {
    public String reverseWords(String s) {
        String word[] = s.split(" ");
        String ans = "";
        for(int i = 0;i<word.length;i++){
            StringBuilder sb = new StringBuilder(word[i]);
        ans += sb.reverse().toString();
        
        if(i<word.length - 1){
            ans += " ";
        }
        } 
        return ans;
    }
}