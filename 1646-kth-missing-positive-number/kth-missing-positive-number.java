class Solution {
    public int findKthPositive(int[] arr, int k) {
        int missing_num=0;
        int num = 1;
        for(int i=0; i<arr.length; i++){
            while(num<arr[i]){
                missing_num++;

                if(missing_num == k){
                    return num;
                }
                num++;
            }
            if(num == arr[i]){
                num++;
            }

        }
        return num + (k - missing_num) - 1; 
    }
}