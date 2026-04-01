package leetcode.solutions;

class Main {
    public static void main(String[] args) {
        Solution1672 solution = new Solution1672();
        int[][] accounts = {{7, 1, 3}, {2, 8, 7}, {1, 9, 5}};
        int richestCustomerWealth = solution.richestCustomerWealth(accounts);
        System.out.println(richestCustomerWealth);
    }
}
