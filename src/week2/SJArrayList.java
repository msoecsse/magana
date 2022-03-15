package week2;


import java.util.*;

/**
 * This class implements some of the methods of the Java ArrayList class.
 * See the Java List Interface documentation for details
 *
 * @param <E> Generic type that will be declared by the user
 */
public class SJArrayList<E> implements List<E> {
    /**
     * The default initial capacity
     */
    private static final int INITIAL_CAPACITY = 10;

    /**
     * The underlying data array
     */
    private E[] data;

    /**
     * The current size
     */
    private int size = 0;

    /**
     * The current capacity
     */
    private int capacity;

    /**
     * No-argument constructor for the SJArrayList. Sets the current capacity
     * to the default initial capacity of 10 and instantiates the array as the
     * given type
     */
    public SJArrayList() {
        this.capacity = INITIAL_CAPACITY;
        /*
         * Casts the default Object array as an array of the type passed in.
         * Array size will be the same because it is an array of references
         * regardless of the object type.
         */
        this.data = (E[]) new Object[capacity];
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean isEmpty() {
        return this.size == 0;
    }

    @Override
    public boolean contains(Object o) {
        boolean found = false;
        for (int i = 0; !found && i < size; ++i) {
            found = Objects.equals(o, data[i]);
        }
        return found;
    }

    @Override
    public boolean add(E e) {
        if (size == capacity) {
            reallocate();
        }
        data[size++] = e;
        return true;

    }

    @Override
    public boolean remove(Object o) {
        int index = size;
        boolean found = false;

        for (int i = 0; i < size && !found; i++) {
            if (Objects.equals(o, data[i])) {
                found = true;
                index = i;
            }
        }

        if(found) {
            if (size - index + 1 >= 0) {
                System.arraycopy(data, index + 1, data, index + 1 - 1, size - index + 1);
                --size;
            }
        }
        return found;
    }

    @Override
    public void clear() {
        this.size = 0;
        this.capacity = INITIAL_CAPACITY;
        this.data = (E[]) new Object[capacity];
    }

    @Override
    public E get(int index) {
        if(index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Index " + index + " does not exist");
        }
        return data[index];
    }

    @Override
    public E set(int index, E element) {
        if(index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Index " + index + " does not exist");
        }
        E old = data[index];
        data[index] = element;
        return old;
    }

    @Override
    public void add(int index, E element) {
        if(index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Index " + index + " does not exist");
        }
        if(this.size == this.capacity) {
            reallocate();
        }
        if (size - index >= 0) {
            System.arraycopy(data, index, data, index + 1, size - index);
        }

        data[index] = element;
        ++size;
    }

    @Override
    public E remove(int index) {
        // index is valid
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Index " + index + " does not exist");
        }

        E oldValue = data[index];
        if (size - index + 1 >= 0) {
            System.arraycopy(data, index + 1, data, index + 1 - 1, size - index + 1);
            --size;
        }
        return oldValue;
    }

    @Override
    public int indexOf(Object o) {
        boolean found = false;
        int index = 0;
        for (int i = 0; !found && i < size; ++i) {
            found = Objects.equals(o, data[i]);
            index = i;
        }
        if(!found){
            index = -1;
        }
        return index;
    }

    @Override
    public int lastIndexOf(Object o) {
        throw new UnsupportedOperationException("Not giving you the answer yet...");
    }

    @Override
    public Object[] toArray() {
        Object[] array = new Object[size];
        System.arraycopy(data, 0, array, 0, size);
        return array;
    }

    /**
     * This method takes the middle element of the list and moves it to the end,
     * shifting all the elements that come after the middle value back one index.
     *
     * @throws UnsupportedOperationException Currently throws this because you haven't
     * finished your homework yet. It won't once you're done.
     */
    public void middleToEnd() {
        int index = size/2;
        E placeholder = get(index);
        remove(index);
        add(placeholder);
    }

    @Override
    public Iterator<E> iterator() {
        throw new UnsupportedOperationException("Iterators not implemented in this List");
    }

    @Override
    public ListIterator<E> listIterator() {
        throw new UnsupportedOperationException("Iterators not supported in this List");

    }

    @Override
    public ListIterator<E> listIterator(int index) {
        throw new UnsupportedOperationException("Iterators not supported in this List");
    }

    @Override
    public List<E> subList(int fromIndex, int toIndex) {
        throw new UnsupportedOperationException("Sublist not supported in this List");
    }

    @Override
    public <T> T[] toArray(T[] a) {
        throw new UnsupportedOperationException("Array casting not supported");
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        throw new UnsupportedOperationException("Collections not supported in this List");
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        throw new UnsupportedOperationException("Collections not supported in this List");

    }

    @Override
    public boolean addAll(int index, Collection<? extends E> c) {
        throw new UnsupportedOperationException("Collections not supported in this List");

    }

    @Override
    public boolean removeAll(Collection<?> c) {
        throw new UnsupportedOperationException("Collections not supported in this List");

    }

    @Override
    public boolean retainAll(Collection<?> c) {
        throw new UnsupportedOperationException("Collections not supported in this List");
    }

    /**
     * Increases the size of the backing array by 100%, maintaining the
     * values and order of the existing array
     */
    private void reallocate() {
        capacity *= 2;
        data = Arrays.copyOf(data, capacity);
    }
}