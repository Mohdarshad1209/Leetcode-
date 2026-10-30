class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res=new ArrayList<>();
        boolean[] visited=new boolean[strs.length];
        for(int i=0;i<strs.length;i++){
            if(visited[i]) continue;
            List<String> currentGroup=new ArrayList<>();
            currentGroup.add(strs[i]);
            visited[i]=true;
            for(int j=i+1;j<strs.length;j++){
                if(!visited[j]&&isAnagram(strs[i],strs[j])){
                    currentGroup.add(strs[j]);
                    visited[j]=true;
                }
            }
            res.add(currentGroup);
        }
        return res;
    }

    private boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        int[] cnt=new int[26];
        for(int i=0;i<s.length();i++){
            cnt[s.charAt(i)-'a']++;
            cnt[t.charAt(i)-'a']--;
        }
        for(int c:cnt){
            if(c!=0) return false;
        }
        return true;
    }
}