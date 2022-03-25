package StackExample;

import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;

public class Stack <E> {

    private List<E> list = new LinkedList<E>();

    public boolean isEmpty()
    {
        return list.isEmpty();
    }
    public E push (E obj)
    {
        list.add(0, obj);
        return obj;
    }
    public E pop()
    {
        if (isEmpty())
            throw new NoSuchElementException(); // from pg. 153-4

        return list.remove(0);
    }
    public E peek()
    {
        if (isEmpty())
            throw new NoSuchElementException(); // from pg. 153-4

        return list.get(0);


    }

}
