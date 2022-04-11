package wwek6;



public class BST<E extends Comparable> {
    private Node<E> root;
    private static class Node<E>{
        E value;
        Node leftchild;
        Node rightchild;

        Node (E value){
            this(value, null, null);
        }
        Node(E value, Node<E> left, Node<E> right){
            this.value = value;
            this.leftchild = left;
            this.rightchild = right;
        }

    }
    BST(){
        root = null;
    }

    public void add(E value){
        // create a new node,
        // put it in the next available spot

        // tree could be empty
        // root = new node

        // or tree could have something in it, and we have to check vlaue of root node,
        // and go left or right based on that
    }
}
