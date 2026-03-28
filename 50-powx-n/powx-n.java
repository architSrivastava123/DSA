class Solution {
    public double myPow(double x, int n) {
        if(n<0){
            x = 1/x;
            n=-n;
            if(n == Integer.MIN_VALUE){
                return x*myPow(x,-(n+1));
            }
        }
        
        if(n == 0){
            return 1;
        }
        double ans = myPow(x,n/2);
        if(n%2==0){
            return ans*ans;
        }
        return x*ans*ans;
    }
}