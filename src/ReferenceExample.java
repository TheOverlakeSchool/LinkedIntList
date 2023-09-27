public class ReferenceExample {
    public static void main(String[] args) {
        MutableInteger a = new MutableInteger(1);
        MutableInteger b = new MutableInteger(2);
        swap(a,b);
        System.out.println("The value of a is " + a + " and the value of b is " + b);

    }

    private static void swap(MutableInteger a, MutableInteger b) {
        int temp = a.value;
        a.value = b.value;
        b.value = temp;
    }
}
