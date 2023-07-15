package HomeWork.HW_9_4.LinkedArrays;

import java.util.Iterator;

public class LinkedArrayIterator <L> extends GBLinkedList implements Iterator <L>{

    int counter = 0;

    @Override
    public boolean hasNext() {
        return counter < size;
    }

    @Override
    public L next() {

        return (L) getElementByIndex(counter++);
    }

//    @Override
//    public Iterator<L> reverseIterator() {
//        return new Iterator<L>() {
//            int counter = size - 1;
//            @Override
//            public boolean hasNext() {
//                return counter >= 0;
//            }
//
//            @Override
//            public L next() {
//                return (L) getElementByIndex(counter--);
//            }
//        };
}
