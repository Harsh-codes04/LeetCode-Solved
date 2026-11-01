class Solution {
    public boolean checkIfPangram(String sentence) {
        boolean[] mark = new boolean[26];
            int index = 0;
        for(int i = 0;i<sentence.length();i++){
            char ch = sentence.charAt(i);

            if('A'<= ch && ch <= 'Z'){
                index = ch - 'A';
            }
            else if('a' <= ch && ch <= 'z'){
                index = ch - 'a';
            }
            else{
                continue;
            }
            mark[index] = true;
        }
        for(boolean present: mark){
            if(!present){
                return false;
            }
        }
        return true;
    }
}