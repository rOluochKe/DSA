class Solution {
  public int smallestEvenMultiple(int n) {
    if (n % 2 == 0) {
      return n;
    }
    return n * 2;
  }
}

// test cases

// n = 5

// n = 6