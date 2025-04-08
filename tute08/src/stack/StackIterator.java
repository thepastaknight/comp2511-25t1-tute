package stack;

import java.util.List;
import java.util.Iterator;

public class StackIterator<E> implements Iterator<E> {

    private List<E> stack;
    private int cursor;

    public StackIterator(List<E> stack) {
        this.stack = stack;
        this.cursor = stack.size() - 1;
    }

    @Override
    public boolean hasNext() {
        return cursor >= 0;
    }

    @Override
    public E next() {
        E value = stack.get(cursor);
        cursor--;
        return value;
    }

}
