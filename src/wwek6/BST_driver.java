package wwek6;

public class BST_driver {
    public static void main(String[] args) {
        BST tree = new BST();

        // we have a "simple" add, so these have to be added carefully to maintain a full tree
        tree.add(8);
        //System.out.println(tree);
        tree.add(10);
        //System.out.println(tree);
        tree.add(4);
        //System.out.println(tree);
        tree.add(5);
        System.out.println(tree);

        System.out.println("contains: 8: " +tree.contains(8));

        System.out.println("contains: 5: " +tree.contains(5));
        System.out.println("contains: 1: " +tree.contains(1));
        System.out.println("contains: 14: " +tree.contains(14));

    }
}
