class Solution {
    public List<String> generateParenthesis(int n) {
        
        List<String> list = new ArrayList<>();
        generate(list,"",0,0,n);
        return list;
    }

    public void generate(List<String> list,String str,int open,int close,int n){

        if(str.length() == n*2){
            list.add(str);
            return;
        }

        if(open<n){
            generate(list,str + "(",open + 1,close,n);
        }
        if(close<open){
            generate(list,str + ")",open,close + 1,n);
        }
    }
}
