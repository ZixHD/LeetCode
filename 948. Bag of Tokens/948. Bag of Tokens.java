class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        
        Arrays.sort(tokens);
        int score = 0;
        int left = 0, right = tokens.length - 1;
        while(left <= right){

            if(power >= tokens[left]){
                score++;
                power-= tokens[left];
                left++;
            }
            else if(score>=1 && left != right){
                power+=tokens[right];
                right--;
                score--;
            }else break;
        }

        return score;
    }
}
