class Solution {
  public double[] convertTemperatures(double[] celsius) {
    double kelvin = celsius + 273.15;
    double fahrenheit = celsius * 1.8 + 32.0;

    double[] ans = new double[]{kelvin, fahrenheit};
    return ans;
  }
}

// test cases
// celsius = 36.50
// celsius = 122.11