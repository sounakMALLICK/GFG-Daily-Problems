class Solution {
    public long subarrayXor(int arr[], int k) {
        // code here
        Map<Integer, Integer> map = new HashMap<>();
        int xor = 0;
        long ans = 0;
        map.put(0, 1);
        for(int i=0; i<arr.length; i++){
            xor ^= arr[i];
            ans += map.getOrDefault(xor^k, 0);
            map.put(xor, map.getOrDefault(xor, 0)+1);
        }
        return ans;
    }
}