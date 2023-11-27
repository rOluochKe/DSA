from ast import List

class Solution:
  def numberOfEmployeesWhoMetTarget(self, hours: List[int], target: int) -> int:
    count = 0
    for hoursWorked in hours:
      if hoursWorked >= target:
        count += 1
    return count