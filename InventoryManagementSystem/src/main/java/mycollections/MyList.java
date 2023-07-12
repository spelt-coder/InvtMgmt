package mycollections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MyList<E> extends ArrayList<E> implements List<E> {
    public void viewAllElements() {
        Iterator<E> it = this.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
