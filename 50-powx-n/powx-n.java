class Solution {
    public double myPow(double x, int n) {
        if(n<0){
            x=1/x;
            n = -n;
            if(n == Integer.MIN_VALUE){
                return x*myPow(x , -(n+1));
            }
        }
        if(n<1){
            return 1;
        }
        double ans = myPow(x, n/2);
        double dans = ans*ans;
        if(n%2!=0){
            return x*dans;
        }
        return dans;
        
    }
}