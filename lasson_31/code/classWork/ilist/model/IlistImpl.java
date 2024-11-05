package classWork.ilist.model;

import java.util.Arrays;
import java.util.Iterator;

public class IlistImpl implements Ilist{

    Object[] elements;
    private int size;

    public IlistImpl(int initialCapacity) {
        if (initialCapacity < 0){
            throw new IllegalArgumentException("Illegal capacity " + initialCapacity);
        }
        elements = new Object[initialCapacity];
    }

    public IlistImpl(){
        this(10);

    }


    @Override
    public int size() {
        return 0;
    }

    @Override
    public void clean() {
        for (int i = 0; i < size; i++) {
            elements[i] = null;
        }
        size = 0;
    }

    @Override
    public boolean add(Object element) {
        return false;
    }

    @Override
    public boolean add(int index, Object element) {
        ensureCapacity();
        elements[size++] = element;
        return true;
    }

    private void ensureCapacity() {
        if(size == elements.length){
          if (size == Integer.MAX_VALUE){
              throw new OutOfMemoryError();
          }
          int newCapacity = elements.length + elements.length / 2;
          if (newCapacity < 0){
              newCapacity = Integer.MAX_VALUE;
          }

          elements = Arrays.copyOf(elements, newCapacity);
        }

    }

    @Override
    public Object remove(int index) {
        return null;
    }



    @Override
    public Object get(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public Iterator iterator() {
        return null;
    }

}// end of class
