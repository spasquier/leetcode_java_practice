package leetcode.solutions;

class Main {
    public static void main(String[] args) {
        Solution383 solution = new Solution383();
        boolean result = solution.canConstruct("aabb", "aab");
        System.out.println(Boolean.toString(result));
    }
}
