package wwek6;



public class BST<E extends Comparable> {
    private Node<E> root;

    private static class Node<E> {
        E value;
        Node leftchild;
        Node rightchild;

        Node(E value) {
            this(value, null, null);
        }

        Node(E value, Node<E> left, Node<E> right) {
            this.value = value;
            this.leftchild = left;
            this.rightchild = right;
        }

        public String toString(){
            return value==null?"null":value.toString();
        }

    }

    BST() {
        root = null;
    }


    // this is non-recursive, redo as recursive
    public void add(E value) {
        // create a new node,
        // has to be Node<E> for comparable to work
        Node<E> n = new Node(value);
        // put it in the next available spot
        // tree could be empty
        if (root == null){
            root = n;
        }
        Node<E> cur = root;

        // or tree could have something in it, and we have to check vlaue of root node,
        while (n != cur) {
            if (n.value.compareTo(cur.value) < 0) { // double check??
                // go left
                if (cur.leftchild == null) {
                    cur.leftchild = n;
                }
                cur = cur.leftchild;

            } else {
                // go right
                if (cur.rightchild == null) {
                    cur.rightchild = n;
                }
                cur = cur.rightchild;

            }
        }
        // and go left or right based on that
    }

    // from homework 6
    @Override
    public String toString() {
        System.out.println("got here");
        StringBuilder sb = new StringBuilder();
        toString(root, 1, sb);
        return sb.toString();
    }

    private void toString(Node<E> node, int height, StringBuilder sb) {
        for (int i = 1; i < height; ++i) {
            sb.append(" ");
        }
        if (node == null) {
            sb.append("*\n");
        } else {
            sb.append(node).append("\n");
            toString(node.leftchild, height + 1, sb);
            toString(node.rightchild, height + 1, sb);
        }

    }

    public boolean contains(E lookingFor){
        return contains(root, lookingFor);
    }

    private boolean contains(Node<E> cur, E lookingFor) {
        if (cur == null)
            return false;

        int result = lookingFor.compareTo(cur.value);
        if ( result == 0) { // equals
            return true;
        }else if (result < 0)
            return contains (cur.leftchild, lookingFor);
        else
            return contains (cur.rightchild, lookingFor);

    }
}
