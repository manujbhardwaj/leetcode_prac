/*
Given a singly linked list, determine if it is a palindrome.

Follow up:
Could you do it in O(n) time and O(1) space?
*/
public class PalidromeLinkedList {
    public boolean isPalindrome(ListNode head) {
        ListNode curr = head;
        ListNode tail = null;
        while(curr != null)
        {
            ListNode node = new ListNode(curr.val);
            node.next = tail;
            tail = node;
            curr = curr.next;
        }
        while(tail != null &&
              head != null)
        {
            if(tail.val != head.val)
            return false;
            
            tail = tail.next;
            head = head.next;
        }
        return true;
    }
}
