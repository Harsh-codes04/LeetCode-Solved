import java.util.ArrayList;
class Solution {
    public int calPoints(String[] operations) {
        ArrayList<Integer> score = new ArrayList<>();

        for(int i = 0; i<operations.length;i++){

            if(operations[i].equals("C")){
                score.remove(score.size()-1);
            }
            else if(operations[i].equals("+")){
                int last = score.get(score.size() - 1);
                int secondlast = score.get(score.size() - 2);
                score.add(last + secondlast);
            }
            else if(operations[i].equals("D")){
                int last = score.get(score.size() - 1);
                score.add(last * 2);
            }
            else{
                score.add(Integer.parseInt(operations[i]));
            }
        }
        int sum = 0;

        for(int i = 0;i<score.size();i++){
            sum += score.get(i);
        }
        return sum;
    }
}