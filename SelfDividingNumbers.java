import java.util.ArrayList;
import java.util.List;

class Solution {
  public List<Integer> selfDividingNumbers(int left, int right) {
    List<Integer> results = new ArrayList<>();
    for (int num = left; num <= right; num++) {
      int original = num;
      boolean isSelfDividing = true;
      while (original > 0 && isSelfDividing) {
        int digit = original % 10;
        if (digit == 0 || num % digit != 0) {
          isSelfDividing = false;
        }
        original /= 10;
      }
      if (isSelfDividing) {
        results.add(num);
      }
    }
    return results;
  }
}

// Test cases
// left = 1, right = 22

// left = 47, right = 85