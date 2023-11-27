class Solution {
  public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
    int count = 0;
    for (int hoursWorked : hours) {
      if (hoursWorked >= target) {
        count++;
      }
    }
    return count;
  }
}

// test cases

// hours = [0,1,2,3,4], target = 2
// hours = [5,1,4,2,2], target = 6