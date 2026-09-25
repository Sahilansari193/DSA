
import java.util.*;

class Solution {
    public void moveZeroes(int[] nums) {
        Queue<Integer> q = new LinkedList<>();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                q.add(nums[i]);
            }
        }

        int i = 0;

        while (!q.isEmpty()) {
            nums[i] = q.poll();
            i++;
        }

        while (i < nums.length) {
            nums[i] = 0;
            i++;
        }
    }
}