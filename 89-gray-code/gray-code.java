class Solution {
    public List<Integer> grayCode(int n) {
        List<Integer> ans=new ArrayList<>();
        ans.add(0);
        int mul=1;
        for(int i=0;i<n;i++){
            int cur=ans.size();
            for(int j=cur-1;j>=0;j--){
                ans.add(ans.get(j)+mul);
            }
            mul*=2;
        }
        return ans;
    }
}