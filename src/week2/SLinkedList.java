package week2;

import java.util.List;

public class SLinkedList <E> {//implements List<E> {
    private Node head;
    private Node tail;
    private int size;

    private class Node {
        private E data;
        private Node next;

        public Node(E data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    public SLinkedList() {
        size = 0;
        head = null;
        tail = null;
    }
    public void add(E element) {

        Node n = new Node(element, null);

        // case empty list
        if (size == 0)
        {
            head = n;
            tail = n;
            size++;
        }
        else
        {
            // head doesn't change
            tail.next=n;
            tail = n;
            size ++;
        }

    }

    // create a driver that uses this (and tests it) to test out the add method abovr
    public String toString(){
        String s = "";
        Node cur = head;
        while (cur != null)
        {

            s+= cur.data + "-->";
            cur = cur.next;
        }
        s+="null";
        return s;
    }

}
