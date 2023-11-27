class Solution {
  public int numGoodPairs(int[] nums) {
    int count = 0;
    for (int i = 0; i < nums.length; i++) {
      for (int j = i + 1; j < nums.length; j++) {
        if (nums[i] == nums[j]) {
          count++;
        }
      }
    }
    return count;
  }
}

// Test cases

// nums = [1,2,3,1,1,3]
// nums = [1,1,1,1]
// nums = [1,2,3]