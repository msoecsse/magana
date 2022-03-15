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
        list.add(9);
        System.out.println(list);
        list.remove(new Integer(22));
        System.out.println(list);

        // TODO remove isn't working correctly when removing head, also need to update tail
        // TODO if removing last node
        Integer two = 2;
        list.remove(two);
        System.out.println(list);
    }
}
