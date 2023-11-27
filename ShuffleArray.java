class Solution {
  public int[] shuffle(int[] nums, int n) {
    int[] shuffled = new int[nums.length];
    int xIndex = 0, yIndex = n;

    for (int i = 0; i < nums.length; i++) {
      if (i % 2 == 0) {
        shuffled[i] = nums[xIndex++];
      } else {
        shuffled[i] = nums[yIndex++];
      }
    }
    return shuffled;
  }
}


// Test cases
// nums = [2,5,1,3,4,7], n = 3

// nums = [1,2,3,4,4,3,2,1], n = 4

// nums = [1,1,2,2], n = 2