import java.util.Vector;

class Solution {
    public int[] runningSum(int[] nums) {
        int sum = 0;
        Vector<Integer> v = new Vector<>();

        for(int i = 0; i < nums.length; i++) {
            sum += nums[i];
            v.add(sum);
        }

        int[] ans = new int[v.size()];

        for(int i = 0; i < v.size(); i++) {
            ans[i] = v.get(i);
        }

        return ans;
    }
}