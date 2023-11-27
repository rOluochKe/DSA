from ast import List


class Solution:
  def selfDividingNumbers(self, left: int, right: int) -> List[int]:
    results = []
    for num in range(left, right + 1):
      original = num
      isSelfDividing = True
      while original > 0 and isSelfDividing:
        digit = original % 10
        if digit == 0 or num % digit != 0:
          isSelfDividing = False
        original //= 10
      if isSelfDividing:
        results.append(num)
    return results