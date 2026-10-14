class Solution {
    public String maxSumOfSquares(int num, int sum) {
        StringBuilder res=new StringBuilder();
        if(num*9<sum) return res.toString();
        int ninesUsed=sum/9;
        for(int i=0;i<ninesUsed;i++) res.append("9");
        int rem=sum%9;
        if(res.length()==num) return res.toString();
        else{
            while(res.length()!=num){
                res.append(String.valueOf(rem));
                rem/=9;
            }
        }
        return res.toString();
    }
}