class Solution {
    public int maxSum(List<Integer> nums, int k) {
        int[] bitCount=new int[32];
        for(int num:nums){
            int i=0;
            while(num>0){
                bitCount[i++]+=num%2;
                num/=2;
            }
        }
        long sum=0;
        int MOD=1000000007;
        for(int i=0;i<k;i++){
            long curNum=0;
            int power=1;
            for(int j=0;j<32;j++){
                if(bitCount[j]>i)
                    curNum+=power;
                power*=2;
            }
            sum=(sum+(curNum*curNum)%MOD)%MOD;
        }
        return (int)sum;
    }
}