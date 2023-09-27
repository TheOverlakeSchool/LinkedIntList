import java.util.Iterator;

public class LinkedIntList implements IntList {

    private ListNode front;
    private ListNode end;

    private int size;

    public int get(int index) {
        return 0;
    }

    public void add(int value) {
        end.next = new ListNode(value);
        end = end.next;
        size++;
    }

    public void addAll(IntList list) {

    }

    public void add(int index, int value) {

    }

    public int remove(int index) {
        return 0;
    }

    public int size() {
        return 0;
    }

    public Iterator<Integer> iterator() {
        return null;
    }
}
