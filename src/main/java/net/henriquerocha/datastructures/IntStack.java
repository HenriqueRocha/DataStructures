package net.henriquerocha.datastructures;

public interface IntStack {
    /**
     * Is this stack empty?
     *
     * @return true if and only if this stack contains no items; false otherwise.
     */
    boolean isEmpty();

    /**
     * Pushes an item onto the top of this stack.
     *
     * @param i the item to be pushed onto this stack
     */
    void push(int i);

    /**
     * Looks at the object at the top of this stack without removing it from the stack.
     *
     * @return the object at the top of this stack
     */
    int peek();

    /**
     * Removes the object at the top of this stack and
     * returns that object as the value of this function.
     *
     * @return the object at the top of this stack.
     */
    int pop();
}
