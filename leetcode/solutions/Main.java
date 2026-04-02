package leetcode.solutions;

class Main {
    public static void main(String[] args) {
        ListNode nextNode = null;
        ListNode headNode = null;
        for (int i = 6; i > 0; i--) {
            headNode = new ListNode(i, nextNode);
            nextNode = headNode;
        }

        Solution876 solution = new Solution876();
        ListNode result = solution.middleNode(headNode);
        while(result != null) {
            System.out.println(Integer.toString(result.val) + " ");
            result = result.next;
        }
    }
}
