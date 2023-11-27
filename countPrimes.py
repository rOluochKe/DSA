class Solution:
    def countPrimes(self, n: int) -> int:
        if n <= 1:
            return 0

        primes = [0 for _ in range(n)]
        count = 0

        for i in range(2, n):
            if primes[i] == 0:
                primes[i] = 1
                count += 1

                for j in range(i * 2, n, i):
                    primes[j] = -1

        return count