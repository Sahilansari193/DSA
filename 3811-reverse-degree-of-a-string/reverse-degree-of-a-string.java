class Solution {
    public int reverseDegree(String s) {
        int sum = 0;
        int x = s.length();

        for (int i = 0; i < x; i++) {
            int value = s.charAt(i) - 'a' + 1;
            int reverse = 26 - value + 1;

            sum += reverse * (i + 1);
        }

        return sum;
    }
}