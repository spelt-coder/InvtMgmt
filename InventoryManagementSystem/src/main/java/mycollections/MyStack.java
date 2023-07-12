package mycollections;

import java.util.Iterator;
import java.util.Stack;

public class MyStack<E> extends Stack<E> {
    public void viewAllElements() {
        Iterator<E> it = this.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}

