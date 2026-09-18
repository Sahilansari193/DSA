import java.util.*;

class Solution {
    public void reverseString(char[] s) {
        int x = s.length;
        Vector<Character> c = new Vector<>();

        for (int i = x - 1; i >= 0; i--) {
            c.add(s[i]);
        }

        for (int i = 0; i < x; i++) {
            s[i] = c.get(i);
        }
    }
}