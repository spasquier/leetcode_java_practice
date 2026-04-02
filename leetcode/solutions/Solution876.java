package leetcode.solutions;

import java.util.ArrayList;
import java.util.List;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution876 {

    public ListNode middleNode(ListNode head) {
        List<ListNode> nodes = new ArrayList<>();
        ListNode currentHead = head;
        int length = 0;
        while(currentHead != null) {
            nodes.add(currentHead);
            currentHead = currentHead.next;
            length++;
        }
        return nodes.get(length / 2);
    }
}