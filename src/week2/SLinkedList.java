package week2;

import java.util.List;

// TODO need to fix and test 8 methods (7 from class groups, plus the remove(object)
// TODO need to test on empty list, when dealing with head, and when dealing with tail
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

    // TODO to be fixed, what if we are deleting head or tail
    public boolean remove(Object o) {

        Node cur = head;
        Node toBeDeleted = null;
        Node rightBeforetoBeDeleted = null;
        boolean found = false;
        while (cur != null && !found)
        {

            if (cur.data.equals(o))
            {
                found = true;
                toBeDeleted = cur;
            }
            else {
                rightBeforetoBeDeleted = cur;
                cur = cur.next;
            }
        }

        if (found)
        {
            // set the node before the toBeDeleted 's next to toBeDelete.next
            rightBeforetoBeDeleted.next = toBeDeleted.next;
        }

        return found;
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

    // group 1 TODO test
    public boolean add (int i, E element){
        Node cur = head;
        Node toBeAdded = null;
        toBeAdded.data =element;
        Node rightBeforeToBeAdded = null;
        int index = 0;
        boolean found = false; // change this variable name
        while (cur!=null && !found){
            if (index == i){
                found = true;
                toBeAdded.next = rightBeforeToBeAdded.next;
                rightBeforeToBeAdded.next = toBeAdded;
            }
            index ++;
        }
        return found; // JCM
    }

    // group 2 TODO test
    public boolean contains(Object o){
        Node cur = head;
        boolean found = false;
        while (!found && cur.next !=null){ // JCM empty list exception?
            if (cur.data.equals(o)){
                found = true;
            }
            cur = cur.next;
        }
        return found;
    }

    // group 3 TODO test
    public E get(int index){ //
        Node cur = head;
        for(int i=0; i<index; i++) {
            cur = cur.next;     // empty list? Not in list?
        }
        return cur.data;
    }

    // group 4 TODO test
    public int indexOf(Object o){
        int index = -1;
        for(int i=0; i<this.size; i++){
            if(this.get(i).equals(o)){ // what if it is not in the list?
                index = i;
            }
        }
        return index;
    }

    // group 5 TODO test
    public E remove(int index){
        if(index>=size || index <0){
            // group is throw exception
            return null;
        }
        boolean match = false;
        Node toBeDeleted = null;
        Node rightBeforeDeleted = null;
        Node current = this.head;
        int i=0;
        while (!match){
            if (i==index){
                match = true;
                toBeDeleted = current;
            }
            else{
                // ran out of time
            }
        }
        return null; //JCM added to make it compile
    }
    // group 6 TODO test
    public void set(int index, E data){
        Node cur = head;
        for(int i=0; i<index; i++){
            if (i!=index){
                cur=cur.next;
            }else {
                cur.data = data;
            }
        }
    }

    // group 7 TODO fix and test
    // compile errors to be fixed, so commented out
    public E[] toArray(){
        /*
        E[] newArray = new E[size];
        Node cur = head;
        for (int i=0; i<size; i++){
            newArray.add[cur.data(i)];
            cur = cur.next;
        }
        return newArray;

         */
        return null;
    }

}
