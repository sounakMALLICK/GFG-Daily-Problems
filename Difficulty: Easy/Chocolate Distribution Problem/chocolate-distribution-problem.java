// User function Template for Java

class Solution {
    public int findMinDiff(ArrayList<Integer> arr, int m) {
        // your code here
        Collections.sort(arr);
        int min = Integer.MAX_VALUE;
        for(int i=0; i<=arr.size()-m; i++){
            int val = arr.get(i+m-1) - arr.get(i);
            if(val < min){
                min = val;
            }
        }
        return min;
    }
}