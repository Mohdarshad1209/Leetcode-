class Solution {
    public int[] singleNumber(int[] nums) {
        int xor=0;
        for(int num:nums){
            xor^=num;
        }
        int mask=xor & -xor;
        int firstUnique=0;
        int secondUnique=0;
        for(int num:nums){
            if((num & mask)==0){
                firstUnique^=num;
            }
            else{
                secondUnique^=num;
            }
        }
        return new int[]{firstUnique,secondUnique};
    }
}