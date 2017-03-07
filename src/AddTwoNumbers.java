/*
You are given two non-empty linked lists representing two non-negative integers. 
The digits are stored in reverse order and each of their nodes contain a single digit. 
Add the two numbers and return it as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8
*/

/*
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode c1 = l1;
        ListNode c2 = l2;
        ListNode sentinel = new ListNode(0);
        ListNode d = sentinel;
        int sum = 0;
        while (c1 != null || c2 != null) {
            if (c1 != null) 
            {
                sum = sum + c1.val;
                c1 = c1.next;
            }
            if (c2 != null) {
                sum = sum + c2.val;
                c2 = c2.next;
            }
            d.next = new ListNode(sum % 10);
            d = d.next;
            sum /= 10;
        }
        if (sum / 10 == 1)
            d.next = new ListNode(1);
        return sentinel.next;
    }
}
*/

public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        int sum, carry = 0, lastDig;
        ListNode head;
        sum = l1.val + l2.val;
        lastDig = sum%10;
        carry = sum/10;
        ListNode node= new ListNode(lastDig);
        head = node;
        
        while(l1.next != null && l2.next != null)
        {
            sum = l1.next.val + l2.next.val + carry;
            lastDig = sum%10;
            carry = sum/10;
            ListNode node1 = new ListNode(lastDig);
            
            node.next = node1;
            node = node1;
            
            l1=l1.next;
            l2=l2.next;
        }
        while(l1.next != null)
        {
            sum = l1.next.val + carry;
            lastDig = sum%10;
            carry = sum/10;
            ListNode node1 = new ListNode(lastDig);
            
            node.next = node1;
            node = node1;
            
            l1=l1.next;
        }
        while(l2.next != null)
        {
            sum = l2.next.val + carry;
            lastDig = sum%10;
            carry = sum/10;
            ListNode node1 = new ListNode(lastDig);
            
            node.next = node1;
            node = node1;
            
            l2=l2.next;
        }
        if(carry>0)
        node.next = new ListNode(carry);
        
        return head;
    }
}
