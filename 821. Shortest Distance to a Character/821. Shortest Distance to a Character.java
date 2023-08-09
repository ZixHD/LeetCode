class Solution {
    public int[] shortestToChar(String s, char c) {
        
         int[] result = new int[s.length()];
        
        int lastC = -1;
        int lastNonC = 0;
        
        for(int i = 0; i<s.length(); i++)
            if(s.charAt(i) == c){
                while(lastNonC<=i)
                    result[lastNonC] = Math.min(result[lastNonC], i-lastNonC++);
                lastC = i;
            }else
                result[i] = lastC != -1 ? i-lastC : Integer.MAX_VALUE;
        
        return result;
    }
}
