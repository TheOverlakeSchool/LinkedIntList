import java.util.List;

public class ListNodeExample {
    public static void main(String[] args) {
        ListNode front = null;
        for (int i = 0; i < 10; i++) {
            front = new ListNode(i, front);
        }

        if (front == null) {
            front = new ListNode();
        } else {
            ListNode temp = front;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = new ListNode(42);
        }

        print(front);
    }

    private static void print(ListNode front) {
        StringBuilder builder = new StringBuilder("[");
        if (front != null) {
            builder.append(front.value);
        }
        while (front.next != null) {
            builder.append(", ");
            builder.append(front.next.value);
            front = front.next;

        }
        builder.append("]");
        System.out.println(builder);
    }
}
