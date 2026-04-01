package leetcode.solutions;

class Main {
    public static void main(String[] args) {
        Solution1480 solution = new Solution1480();
        int[] nums = {1, 2, 3, 4};
        int[] result = solution.runningSum(nums);
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
