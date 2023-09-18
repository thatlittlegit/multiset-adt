public interface MultiSet<T> {
    /**
     * Adds the item to the multiset.
     *
     * @param item The item to add.
     * @return Always true.
     */
    boolean add(T item);

    /**
     * Removes the specified item from the multiset. Does nothing if it is not
     * in there.
     *
     * @param item The item to remove.
     */
    void remove(T item);

    /**
     * Checks if the multiset contains the item.
     *
     * @param item The item to check.
     * @return Whether the item is present.
     */
    boolean contains(T item);

    /**
     * Checks if the multiset has any elements.
     *
     * @return Whether the list is empty.
     */
    boolean isEmpty();

    /**
     * Counts how many times the item appears in the list.
     *
     * @param item The item to count.
     * @return The number of times it appears.
     */
    int count(T item);

    /**
     * Counts how many items are in the list.
     *
     * Items present multiple times are not counted.
     *
     * @return The number of distinct items in the list.
     */
    int size();
}
