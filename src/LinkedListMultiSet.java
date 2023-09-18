public class LinkedListMultiSet<T> implements MultiSet<T> {
    /**
     * The first node in the multiset. If null, the multiset is empty.
     */
    private Node<T> front;

    /**
     * The number of elements in the set, memoized to avoid O(n) runtime.
     */
    private int size;

    private static class Node<T> {
        private final T item;
        public Node<T> next;

        public Node(T item) {
            this.item = item;
            this.next = null;
        }

        public T getItem() {
            return item;
        }
    }

    public LinkedListMultiSet() {
        this.front = null;
        this.size = 0;
    }

    @Override
    public boolean add(T item) {
        Node<T> node = new Node<>(item);
        node.next = front;

        front = node;
        size += 1;
        return true;
    }

    @Override
    public void remove(T item) {
        Node<T> current = front;
        Node<T> previous = null;

        while (current != null) {
            if (current.getItem().equals(item)) {
                size -= 1;

                if (previous == null) {
                    front = current.next;
                } else {
                    previous.next = current.next;
                }

                return;
            }

            previous = current;
            current = current.next;
        }
    }

    @Override
    public boolean contains(T item) {
        Node<T> current = front;

        while (current != null) {
            if (current.getItem().equals(item)) {
                return true;
            }

            current = current.next;
        }

        return false;
    }

    @Override
    public boolean isEmpty() {
        return front == null;
    }

    @Override
    public int count(T item) {
        int seen = 0;
        Node<T> current = front;

        while (current != null) {
            if (current.getItem().equals(item)) {
                seen += 1;
            }

            current = current.next;
        }

        return seen;
    }

    @Override
    public int size() {
        return size;
    }
}
