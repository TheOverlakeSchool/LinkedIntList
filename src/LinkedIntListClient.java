import java.util.Random;

public class LinkedIntListClient {
    public static void main(String[] args) {
        IntList list = new LinkedIntList();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }

        IntList list2 = new ArrayIntList();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            list2.add(random.nextInt(10));
        }

        list.addAll(list2);
        list.add(3, 42);
        System.out.println(list.remove(3));
        System.out.println(list.get(1)); //@TODO implement toString()
    }
}
