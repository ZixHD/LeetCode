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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        int count=0;
        ListNode temp=head;

        while(temp!=null){
            count++;
            temp=temp.next;
        }

        if(count==n){
            return head.next;
        }

        int index=count-n;
        ListNode temp2=head;
        for(int i=0;i<index-1;i++){
            temp2=temp2.next;
        }
        temp2.next=temp2.next.next;

        return head;

    }

  
}
