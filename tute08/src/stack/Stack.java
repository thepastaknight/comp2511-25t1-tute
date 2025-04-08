package stack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * A Simple Stack.
 * 
 * @param <E>
 */
public class Stack<E> implements Iterable<E> {

    private List<E> stack = new ArrayList<>();

    /**
     * Pushes an element onto the top of the stack.
     * 
     * @param element
     */
    public void push(E element) {
        stack.add(element);
    }

    /**
     * Removes the top element of the stack, and returns that element.
     * 
     * @precondition The stack is not empty.
     */
    public E pop() {
        if (stack.isEmpty()) {
            return null;
        }
        return stack.remove(stack.size() - 1);
    }

    /**
     * Returns the top element of the stack, without removing it.
     */
    public E peek() {
        return stack.get(stack.size() - 1);
    }

    /**
     * Returns an iterator to the internal data structure of the stack.
     */
    public Iterator<E> iterator() {
        return new StackIterator(stack);
    }

    /**
     * Returns the size of the stack.
     */
    public int size() {
        return stack.size();
    }

    /**
     * Returns the stack as an ArrayList
     */
    public ArrayList<E> toArrayList() {
        return new ArrayList<E>(stack);
    }

    public static Integer sumStack(Stack<? extends Integer> stack) {
        Integer total = 0;
        for (Integer i : stack) {
            total += i;
        }
        return total;
    }

    public static <T> T prettyPrint(Stack<T> stack) {
        for (T o : stack) {
            System.out.println(o);
        }
        return stack.peek();
    }

    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();
        stack.push("hello");
        stack.push("how");
        stack.push("are");
        stack.push("you");
        stack.push("today");
        prettyPrint(stack);
    }
}
