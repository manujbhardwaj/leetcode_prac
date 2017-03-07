/*
Remove all elements from a linked list of integers that have value val.

Example
Given: 1 --> 2 --> 6 --> 3 --> 4 --> 5 --> 6, val = 6
Return: 1 --> 2 --> 3 --> 4 --> 5 
*/
public class RemoveElementFromLinkedList {
    public ListNode removeElements(ListNode head, int val) {
        if(head == null)
        return head;
        ListNode node = head;
        while(node.next != null)
        {
            if(node.next.val == val)
            {
                node.next = node.next.next;
            }
            else
            node = node.next;
        }
        return head.val == val ? head.next : head;
    }
}
