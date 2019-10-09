package de.thro.inf.prg3.a02;

import java.util.Iterator;

/**
 * @author Peter Kurfer
 * Created on 10/6/17.
 */
public class SimpleListImpl implements SimpleList, Iterable {

    // TODO: Implement the required methods.

    private static class Element {
        Object item;
        private Element next;
    }

    @Override
    public void add(Object item) {
        return;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public SimpleList filter(SimpleFilter filter) {
        return null;
    }

    @Override
    public java.util.Iterator iterator() {
        return null;
    }

    private class Iterator implements java.util.Iterator {
        @Override
        public boolean hasNext() {
            return false;
        }

        @Override
        public Object next() {
            return null;
        }
    }

}



