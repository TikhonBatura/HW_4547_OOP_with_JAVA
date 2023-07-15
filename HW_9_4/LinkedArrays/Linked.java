package HomeWork.HW_9_4.LinkedArrays;

import java.util.Iterator;

public interface Linked<L> {
    void addLast (L l);
    void addFirst (L l);
    int size();
    L getElementByIndex(int counter);

}
