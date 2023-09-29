import java.util.Iterator;
import java.util.List;

public class LinkedIntList implements IntList {

    private ListNode front;
    private ListNode end;

    private int size;

    public int get(int index) {
        checkIndex(index);
        ListNode temp = getTargetListNode(index);
        return temp.value;
    }

    public void add(int value) {
        ListNode penultimate = end;
        end = new ListNode(value);
        if (penultimate == null) {
            front = end;
        } else {
            penultimate.next = end;
        }
        size++;
    }

    public void addAll(IntList list) {
        for (int i : list) {
            add(i);
        }
    }

    public void add(int index, int value) {
        checkIndex(index);
        ListNode target = getTargetListNode(index);
//        ListNode temp = new ListNode(value);
        target.next = new ListNode(value, target.next);
//        temp.next = target.next;
//        target.next = temp;
    }

    private ListNode getTargetListNode(int index) {
        ListNode temp = front;
        for (int i = 0; i < index-1; i++) {
            temp = temp.next;
        }
        return temp;
    }

    private void checkIndex(int index) {
        if (size <= index) {
            throw new IllegalArgumentException();
        }
    }

    public int remove(int index) {
        checkIndex(index);
        ListNode target = getTargetListNode(index);
        int value = target.next.value;
        target.next = target.next.next;
        return value;
    }

    public int size() {
        return size;
    }

    public Iterator<Integer> iterator() {
        return null;
    }
}
