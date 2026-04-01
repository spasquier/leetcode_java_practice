package leetcode.solutions;

import java.util.ArrayList;
import java.util.List;

public class Solution412 {
  public List<String> fizzBuzz(int n) {
    List<String> fizzBuzzList = new ArrayList<>();

    for (int i = 1; i <= n; i++) {
      boolean isFizBuzz = i % 3 == 0 && i % 5 == 0;
      boolean isFiz = i % 3 == 0;
      boolean isBuzz = i % 5 == 0;

      if (isFizBuzz) {
        fizzBuzzList.add("FizzBuzz");
      } else {
        if (isFiz) {
          fizzBuzzList.add("Fizz");
        } else if (isBuzz) {
          fizzBuzzList.add("Buzz");
        } else {
          fizzBuzzList.add(Integer.toString(i));
        }
      }
    }

    return fizzBuzzList;
  }
}
