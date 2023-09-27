public class ListNode {
    public int value;
    public ListNode next;

    ListNode() {
        this(0);
    }

    ListNode(int value) {
        this(value, null);
    }
    ListNode(int value, ListNode next) {
        this.value = value;
        this.next = next;
    }
}
