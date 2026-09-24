class Solution {
    public int smallestIndex(int[] nums) {
        int x =nums.length;

        for(int i = 0;i<x;i++){
            int sum = 0;
            int n = nums[i];
            while(n !=0){
                int d = n % 10;
                sum +=d;
                n /=10;
            }
            if(sum ==i){
                return i;
            }
            
        }
        return -1;
        
    }
}