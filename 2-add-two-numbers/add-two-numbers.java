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
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // Stack<Integer> s1 = new Stack<>();
        // Stack<Integer> s2 = new Stack<>();

        // while (l1 != null) {
        //     s1.push(l1.val);
        //     l1 = l1.next;
        // }

        // while (l2 != null) {
        //     s1.push(l2.val);
        //     l2 = l2.next;
        // }
        ListNode head = new ListNode(0);
        ListNode current = head;
        int carry= 0;

        while(l1!=null|| l2!=null || carry!=0){
            int sum = carry;
            if(l1!=null){
                sum+=l1.val;
                l1=l1.next;
            }
            if(l2!=null){
                sum+=l2.val;
                l2=l2.next;
            }

            carry = sum/10;
            current.next=new ListNode(sum%10);
            current = current.next;

        }
        return head.next;

    }
}