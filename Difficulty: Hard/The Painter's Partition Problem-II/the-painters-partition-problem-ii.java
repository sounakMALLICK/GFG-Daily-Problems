class Solution {
    public int minTime(int[] arr, int k) {
        // code here
        int sum = arr[0], max = arr[0];
        for(int i=1; i<arr.length; i++){
            if(max < arr[i]){
                max = arr[i];
            }
            sum += arr[i];
        }
        if(k==1){
            return sum;
        }
        if(k==arr.length){
            return max;
        }
        int ans = 0;
        int low = max;
        int high = sum;
        while(low <= high){
            int mid = low + (high - low)/2;
            int reqWorkers = findWorkers(arr, mid);
            if(reqWorkers <= k){
                ans = mid;
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return ans;
    }
    public int findWorkers(int[] arr, int mid){
        int sum = 0, workers = 1;
        for(int i=0; i<arr.length; i++){
            if(sum+arr[i] > mid){
                sum = 0;
                workers++;
            }
            sum += arr[i];
        }
        return workers;
    }
}