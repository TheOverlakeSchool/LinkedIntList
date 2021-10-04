public class LinkedIntList {
    private ListNode front;

    public void add(int value) {
        ListNode temp = new ListNode(value);
        if (front == null) {
            front = temp;
        } else {
            ListNode current = front;
            while (current.next != null) {
                current = current.next;
            }
            current.next = temp;
        }
    }
}
