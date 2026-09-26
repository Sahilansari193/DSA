import java.util.*;

class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {

        HashMap<String, String> map = new HashMap<>();

        // Store key and value
        for (List<String> k : knowledge) {
            map.put(k.get(0), k.get(1));
        }

        String ans = "";
        int i = 0;

        while (i < s.length()) {

            if (s.charAt(i) == '(') {

                int j = i + 1;

                // Find closing bracket
                while (s.charAt(j) != ')') {
                    j++;
                }

                // Get key
                String key = s.substring(i + 1, j);

                // Check key in map
                if (map.containsKey(key)) {
                    ans += map.get(key);
                } else {
                    ans += "?";
                }

                i = j + 1;

            } else {
                ans += s.charAt(i);
                i++;
            }
        }

        return ans;
    }
}