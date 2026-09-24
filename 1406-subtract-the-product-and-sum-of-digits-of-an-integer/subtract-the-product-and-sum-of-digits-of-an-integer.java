class Solution {
    public int subtractProductAndSum(int n) {
        int x = n;
        int sum =0;
        int pro =1;
        while(x !=0){
            int d = x % 10;
            pro *=d;
            sum +=d;
            x /=10;
        }
        int h = pro - sum;
        return h;
        
    }
}