class Solution {
    public int findContentChildren(int[] g, int[] s) {
        
        Arrays.sort(g);
        Arrays.sort(s);
        int count=0;
        int pok1=0,pok2=0;
        while(pok1<=g.length-1 && pok2<=s.length-1){
            if(s[pok2]>=g[pok1]){
                pok1++;pok2++;
                count++;
            }else pok2++;
        }
        return count;
    }
}
