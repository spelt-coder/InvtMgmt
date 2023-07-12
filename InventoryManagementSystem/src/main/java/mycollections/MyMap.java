package mycollections;

import java.util.HashMap;
import java.util.Iterator;

public class MyMap<E> extends HashMap<String, E> {
    public void viewAllElements() {
        Iterator<Entry<String, E>> iterator = entrySet().iterator();
        while (iterator.hasNext()) {
            Entry<String, E> entry = iterator.next();
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}
