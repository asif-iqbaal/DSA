// Given the head of a sorted linked list, delete all duplicates such that each element appears
// only once. Return the linked list sorted as well.


public class problem1{
    static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    class solution{
        public ListNode deleteDuplicates(ListNode head) {
        if(head == null) return head;
        ListNode curr = head;
        while(curr != null && curr.next != null){
            if(curr.val == curr.next.val){
                curr.next = curr.next.next;
            }else{
                curr = curr.next;
            }
        }
        return head;
    }
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(3);

        solution sol = new problem1().new solution();
        ListNode result = sol.deleteDuplicates(head);
        while(result != null){
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}