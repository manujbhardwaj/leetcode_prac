/*
Reverse a singly linked list.
*/


























public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        ListNode newHead = null;
        while(head != null)
        {
            head.next = newHead;
            newHead = head;
            head = head.next;
        }
        return newHead;
    }
}
