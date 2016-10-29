package net.henriquerocha.datastructures;

public interface IntQueue extends IntCollection {

    /**
     * Inserts the specified element into this queue.
     *
     * @param e the element to add
     */
    void enqueue(int e);

    /**
     * Retrieves and removes the head of this queue.
     *
     * @return the head of this queue
     */
    int dequeue();
}
