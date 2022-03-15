package week2;

public class week2Driver {
    public static void main(String[] args) {
        SLinkedList<Integer> list = new SLinkedList<>();

        System.out.println(list);
        list.add(2);
        System.out.println(list);
        list.add(5);
        System.out.println(list);
        list.add(20);
        list.add(22);
        list.add(27);
        list.add(29);
        System.out.println(list);
    }
}
