class Solution {
  public int countPrimes(int n) {
    if (n <= 1) {
      return 0;
    }

    int[] primes = new int[n];
    int count = 0;

    for (int i = 2; i < n; i++) {
      if (primes[i] == 0) {
        primes[i] = 1;
        count++;

        for (int j = i * 2; j < n; j += i) {
          primes[j] = -1;
        }
      }
    }

    return count;
  }
}

// test cases

// n = 10
// n = 0
// n = 1