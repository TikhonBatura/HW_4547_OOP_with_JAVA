package HomeWork.HW_9_4.Arrays;

public interface GBlist <T> extends Iterable<T> {

    boolean add (T t);

    void remove (int index);

    T get (int index);

    int size();

    void update (int index, T t);

    GBlist<T> join(T t);
}
