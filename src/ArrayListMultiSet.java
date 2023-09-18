import java.util.ArrayList;
import java.util.List;

public class ArrayListMultiSet<T> implements MultiSet<T> {

    List<T> array = new ArrayList<>();
    @Override
    public boolean add(T item) {
        array.add(item);
        return true;
    }

    @Override
    public void remove(T item) {
        array.remove(item);
    }

    @Override
    public boolean contains(T item) {
        return array.contains(item);
    }

    @Override
    public boolean isEmpty() {
        return array.isEmpty();
    }

    @Override
    public int count(T item) {
        return 0;
        //TODO: FINISH THIS.
    }

    @Override
    public int size() {
        return array.size();
    }
}
