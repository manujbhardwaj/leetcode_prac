/*
Given a sorted linked list, delete all duplicates such that each element appear only once.

For example,
Given 1->1->2, return 1->2.
Given 1->1->2->3->3, return 1->2->3. 
*/






/*
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null)return head;
        head.next = deleteDuplicates(head.next);
        return head.val == head.next.val ? head.next : head;
}
*/
public class RemoveDuplicates {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode n = head;
        while(n != null)
        {
            if(n.next == null)
                break;
            if(n.val == n.next.val)
                n.next = n.next.next;
            else //because next ke next me bhi duplicate ho sakta
                n = n.next;
        }
        return head;
    }
}
