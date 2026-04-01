package leetcode.solutions;

public class Solution1342 {
  public int numberOfStepsToReduceNumberToZero(int number) {
    int steps = 0;
    while (number > 0) {
      if ((number & 1) == 0) {
        number >>= 1;
      } else {
        number--;
      }
      steps++;
    }

    return steps;
  }
}
