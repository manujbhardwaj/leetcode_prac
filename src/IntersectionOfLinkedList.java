/*
Write a program to find the node at which the intersection of two singly linked lists begins.

For example, the following two linked lists:

A:          a1 → a2
                   ↘
                     c1 → c2 → c3
                   ↗            
B:     b1 → b2 → b3

begin to intersect at node c1.

Notes:

    If the two linked lists have no intersection at all, return null.
    The linked lists must retain their original structure after the function returns.
    You may assume there are no cycles anywhere in the entire linked structure.
    Your code should preferably run in O(n) time and use only O(1) memory.
*/

/*
public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    int lenA = length(headA), lenB = length(headB);
    // move headA and headB to the same start point
    while (lenA > lenB) {
        headA = headA.next;
        lenA--;
    }
    while (lenA < lenB) {
        headB = headB.next;
        lenB--;
    }
    // find the intersection until end
    while (headA != headB) {
        headA = headA.next;
        headB = headB.next;
    }
    return headA;
}

private int length(ListNode node) {
    int length = 0;
    while (node != null) {
        node = node.next;
        length++;
    }
    return length;
}
*/
public class IntersectionOfLinkedList {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null)
        return null;
        
        ListNode node1 = headA;
        ListNode node2 = headB;
        while(node1 != node2)
        {
            if(node1 == null)
            node1 = headB;
            
            if(node2 == null)
            node2 = headA;
            
            node1 = node1.next;
            node2 = node2.next;
        }
        return node1;
    }
}
