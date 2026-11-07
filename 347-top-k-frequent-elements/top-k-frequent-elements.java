class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int num:nums){
            mp.put(num,mp.getOrDefault(num,0)+1);
        }
        ArrayList<Map.Entry<Integer,Integer>> arr=new ArrayList<>(mp.entrySet());
        arr.sort((a,b)->b.getValue()-a.getValue());
        int[] end=new int[k];
        for(int i=0;i<k;i++){
            end[i]=arr.get(i).getKey();
        }
        return end;
    }
}