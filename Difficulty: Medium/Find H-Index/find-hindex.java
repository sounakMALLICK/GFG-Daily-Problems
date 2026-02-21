class Solution {
    public int hIndex(int[] citations) {
        // code here
        int ans = 0;
        
        Arrays.sort(citations);
        int i=0, j=citations.length-1;
        while(i<j){
            int temp = citations[i];
            citations[i] = citations[j];
            citations[j] = temp;
            i++;
            j--;
        }
        for(int k=0; k<citations.length; k++){
            if(citations[k]>=(k+1)){
                ans = k+1;
            }
        }
        return ans;
    }
}