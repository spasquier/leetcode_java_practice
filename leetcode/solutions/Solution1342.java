package leetcode.solutions;

public class Solution1342 {
  public int numberOfStepsToReduceNumberToZero(int number) {
    int steps = 0;
    while (number > 0) {
      if (number % 2 == 0) {
        number = number / 2;
        steps++;
      } else {
        number = number - 1;
        steps++;
      }
    }

    return steps;
  }
}
