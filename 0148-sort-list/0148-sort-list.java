class Solution {
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) return head;


        int length = 0;
        ListNode curr = head;
        while (curr != null) {
            length++;
            curr = curr.next;
        }

        ListNode dummy = new ListNode(0);
        dummy.next = head;

    
        for (int step = 1; step < length; step <<= 1) {
            ListNode prev = dummy;
            curr = dummy.next;

            while (curr != null) {
                ListNode left = curr;
                ListNode right = split(left, step);
                curr = split(right, step);

                prev.next = merge(left, right);
                while (prev.next != null) {
                    prev = prev.next;
                }
            }
        }

        return dummy.next;
    }

    // Splits the list after 'step' nodes and returns the head of the remaining list
    private ListNode split(ListNode head, int step) {
        if (head == null) return null;
        for (int i = 1; head.next != null && i < step; i++) {
            head = head.next;
        }
        ListNode second = head.next;
        head.next = null; // Sever connection
        return second;
    }

    private ListNode merge(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                curr.next = l1;
                l1 = l1.next;
            } else {
                curr.next = l2;
                l2 = l2.next;
            }
            curr = curr.next;
        }
        curr.next = (l1 != null) ? l1 : l2;
        return dummy.next;
    }
}