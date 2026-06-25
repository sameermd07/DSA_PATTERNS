class Solution {
    public int splitArray(int[] nums, int k) {
        int low = 0;
        int high = 0;
        
        for (int num : nums) {
            low = Math.max(low, num);
            high += num;
        }
        
        int ans = high;
        
        // Binary search for the minimized largest sum
        while (low <= high) {
            int mid = low + (high - low) / 2;
            
            if (canSplit(nums, k, mid)) {
                ans = mid;        // mid is a feasible maximum sum; try to find a smaller one
                high = mid - 1;
            } else {
                low = mid + 1;    // mid is too small; we need a larger allowance
            }
        }
        
        return ans;
    }
    
    // Helper function to check if we can split the array into <= k subarrays
    // such that each subarray's sum is at most 'maxSumAllowance'
    private boolean canSplit(int[] nums, int k, int maxSumAllowance) {
        int subarrayCount = 1;
        int currentSum = 0;
        
        for (int num : nums) {
            if (currentSum + num > maxSumAllowance) {
                // Start a new subarray
                subarrayCount++;
                currentSum = num;
                
                // If we need more than k subarrays, this allowance is invalid
                if (subarrayCount > k) {
                    return false;
                }
            } else {
                currentSum += num;
            }
        }
        
        return true;
    }
}