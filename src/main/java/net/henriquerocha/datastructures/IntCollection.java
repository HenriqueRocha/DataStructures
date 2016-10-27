package net.henriquerocha.datastructures;

public interface IntCollection {

    /**
     * Is this collection empty?
     *
     * @return true if the collection contains no elements, false otherwise.
     */
    boolean isEmpty();

    /**
     * Ensures that this collection contains the specified element (optional operation).
     *
     * @param element element whose presence in this collection is to be ensured
     */
    void add(int element);

    /**
     * Does this collection contain the specified element?
     *
     * @param i element whose presence in this collection is to be tested
     * @return true if this collection contains the specified element, false otherwise
     */
    boolean contains(int i);
}
