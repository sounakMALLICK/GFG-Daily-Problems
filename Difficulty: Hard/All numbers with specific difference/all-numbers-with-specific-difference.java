class Solution {
    public int getCount(int n, int d) {
        // code here
        if(n<=9){
            return 0;
        }
        int x = 0;
        int low = Math.max(10, d);
        int high = n;
        while(low<=high){
            int mid = low + (high - low)/2;
            int diff = mid - getSumOfDigit(mid);
            if(diff>=d){
                x = mid;
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        if(x==0){
            return 0;
        }
        return n-x+1;
    }
    public int getSumOfDigit(int n) {
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
};