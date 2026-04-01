package leetcode.solutions;

public class Solution1672 {
  public int richestCustomerWealth(int [][] accounts) {
    int richestWealth = 0;
    int currentWealth;
    int m = accounts.length;
    int n = accounts[0].length;

    for (int i = 0; i < m; i++) {
      currentWealth = 0;
      for (int j = 0; j < n; j++) {
        currentWealth += accounts[i][j];
      }
      if (currentWealth > richestWealth) {
        richestWealth = currentWealth;
      }
    }

    return richestWealth;
  }
}
