class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0){
            return false;
        }
        int sum = 0;
        int or = x;

        while(x >0){
            int d = x % 10;
            sum = sum * 10 + d;
            x /=10;
        }
        if(sum == or){
            return true;
        }
        else{
            return false;
        }
        
    }
}