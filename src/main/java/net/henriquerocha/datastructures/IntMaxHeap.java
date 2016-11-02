package net.henriquerocha.datastructures;

public class IntMaxHeap {

    private int[] heap;
    private int nextPosition;

    public IntMaxHeap() {
        heap = new int[1];
    }

    public void add(int i) {
        if (nextPosition == heap.length) {
            growHeap();
        }
        heap[nextPosition++] = i;
        shiftUp(nextPosition - 1);
    }

    private void shiftUp(int i) {
        if (i == 0) return;
        int parent = (i - 1) / 2;
        if (heap[i] > heap[parent]) {
            swap(heap, i, parent);
            shiftUp(parent);
        }
    }

    private static void swap(int[] array, int i, int j) {
        int t = array[i];
        array[i] = array[j];
        array[j] = t;
    }

    private void growHeap() {
        int[] newHeap = new int[heap.length * 2 + 1];
        System.arraycopy(heap, 0, newHeap, 0, heap.length);
        heap = newHeap;
    }

    public int peek() {
        return heap[0];
    }

    public void remove() {
        heap[0] = heap[--nextPosition];
        shiftDown(0);
    }

    private void shiftDown(int i) {
        int leftChildIndex = 2 * i + 1;
        int rightChildIndex = 2 * i + 2;
        if (leftChildIndex > nextPosition || rightChildIndex > nextPosition) return;
        int childIndexWithGreaterValue =
                heap[leftChildIndex] > heap[rightChildIndex] ? leftChildIndex : rightChildIndex;
        if (heap[i] < heap[childIndexWithGreaterValue]) {
            swap(heap, i, childIndexWithGreaterValue);
            shiftDown(childIndexWithGreaterValue);
        }
    }

    private int min(int i, int j) {
        return heap[i];
    }

    public void addAll(int... ints) {
        for (int i : ints) {
            add(i);
        }
    }

    public boolean isEmpty() {
        return nextPosition == 0;
    }
}
