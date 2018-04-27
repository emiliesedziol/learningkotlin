package oo;

import java.util.*;

public class JavaTimeSeries<E> {

    private final Map<Date, E> date2Data = new HashMap<>();

    public void add(E element) { date2Data.put(new Date(), element); }

    public void addAll(Collection<E> elements) {
        for (E element : elements) {
            this.add(element);
        }
    }

    public void addAllCovariant(Collection<? extends E> elements) {
        for (E element : elements) {
            this.add(element);
        }
    }

    public E getLastest() {
        Iterator<E> iterator = date2Data.values().iterator();
        if (!iterator.hasNext()) {
            throw new NoSuchElementException("TimeSeries is empty");
        } else {
            E last = iterator.next();
            while (iterator.hasNext()) {
                last = iterator.next();
            }
            return last;
        }
    }
}
