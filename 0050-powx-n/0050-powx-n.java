class Solution {
    public double myPow(double x, int n) {
        long N = n;
        
        if(N<0) {
            return 1/power(x, -N);
        }
        
        return power(x, N);
    }
    
    private double power(double x,long n){
        if(n==0){
            return 1;
        }
    
        double halfPow = power(x,n/2);
        double halfPowSquare = halfPow * halfPow;
        
        if(n%2!=0){
            halfPowSquare*=x;
        }
        
        return halfPowSquare;
    }
}