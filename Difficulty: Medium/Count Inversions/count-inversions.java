class Solution {
    static int ans = 0;
    static int inversionCount(int arr[]) {
        // Code Here
        ans = 0;
        mergeSort(arr, 0, arr.length-1);
        return ans;
    }
    static void mergeSort(int[] arr, int start, int end){
        if(start==end){
            return;
        }
        int mid = start + (end-start)/2;
        
        mergeSort(arr, start, mid);
        mergeSort(arr, mid+1, end);
        
        merge(arr, start, mid, end);
    }
    
    static void merge(int[] arr, int start, int mid, int end){
        int[] temp = new int[end-start+1];
        int p1=start, p2=mid+1;
        int p3=0;
        
        while(p1<=mid && p2<=end){
            if(arr[p1]<=arr[p2]){
                temp[p3++] = arr[p1++];
            }
            else{
                ans += (mid-p1+1);
                temp[p3++] = arr[p2++];
            }
        }
        
        while(p1<=mid){
            temp[p3++] = arr[p1++];
        }
        
        while(p2<=end){
            temp[p3++] = arr[p2++];
        }
        
        int i=0;
        for(int j=start; j<=end; j++){
            arr[j] = temp[i++];
        }
    }
}