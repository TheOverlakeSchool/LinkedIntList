public class LinkedIntListClient {
    public static void main(String[] args) {
        LinkedIntList list = new LinkedIntList();
        list.addSorted(6);
        list.addSorted(-4);
        list.addSorted(8);
        list.addSorted(22);
        list.addSorted(17);
        list.addSorted(30);
        list.addSorted(-5);
        System.out.println(list);
    }
}
