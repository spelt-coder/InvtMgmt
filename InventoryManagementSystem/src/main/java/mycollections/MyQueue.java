package mycollections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class MyQueue<E> extends LinkedList<E> implements Queue<E> {
    public void viewAllElements() {
        Iterator<E> it = this.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
