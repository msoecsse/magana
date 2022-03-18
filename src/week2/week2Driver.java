package week2;

public class week2Driver {
    public static void main(String[] args) {
        SLinkedList<Integer> list = new SLinkedList<>();
        list.add(0, 4);
        System.out.println(list);
        list.add(0,2);
        System.out.println(list);
        list.add(1,5);
        System.out.println(list);
        list.add(1, 4);

        System.out.println(list);

        // TODO remove isn't working correctly when removing head, also need to update tail
        // TODO if removing last node
       // Integer two = 2;
      //  list.remove(two);
      //  System.out.println(list);
    }
}
