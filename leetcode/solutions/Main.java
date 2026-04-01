package leetcode.solutions;

import java.util.List;

class Main {
    public static void main(String[] args) {
        Solution412 solution = new Solution412();
        int n = 20;
        List<String> fizzBuzzList = solution.fizzBuzz(n);
        for (String element: fizzBuzzList) {
            System.out.println(element);
        }
    }
}
