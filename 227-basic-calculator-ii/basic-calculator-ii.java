class Solution {
    public int calculate(String s) {

        int sum = 0;
        int num = 0;
        int last = 0;
        char op = '+';

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch >= '0' && ch <= '9') {
                num = num * 10 + (ch - '0');
            }

            if ((ch < '0' || ch > '9') && ch != ' ' 
                || i == s.length() - 1) {

                if (op == '+') {
                    sum += last;
                    last = num;
                }
                else if (op == '-') {
                    sum += last;
                    last = -num;
                }
                else if (op == '*') {
                    last = last * num;
                }
                else if (op == '/') {
                    last = last / num;
                }

                op = ch;
                num = 0;
            }
        }

        sum += last;
        return sum;
    }
}