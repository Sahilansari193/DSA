import java.util.Vector;
class Solution {
    public int[] getConcatenation(int[] nums) {
        int x = nums.length;
        Vector<Integer> v = new Vector<>();
        for(int i = 0;i<x;i++){
            v.add(nums[i]);
        }
        for(int i = 0;i<x;i++){
            v.add(nums[i]);
        }
        int[] ans = new int[v.size()];
        for(int i =0;i<v.size();i++){
            ans[i] = v.get(i);
        }
        return ans;
        
    }
}