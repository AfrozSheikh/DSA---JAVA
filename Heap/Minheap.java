package Heap;

import java.util.ArrayList;
import java.util.List;

public class Minheap {
    List<Integer> heap;

    public Minheap() {
        heap = new ArrayList<>();
    }

    // get min element
    public int peek() {
        if (heap.isEmpty()) throw new IllegalStateException("Heap is empty");
        return heap.get(0);
    }

    // Insert element (sift up)
    public void insert(int val) {
        heap.add(val);
        siftUp(heap.size() - 1);
    }

    // Remove and return min element
    public int poll() {
        if (heap.isEmpty()) throw new IllegalStateException("Heap is empty");

        int root = heap.get(0);
        int last = heap.remove(heap.size() - 1);

        if (!heap.isEmpty()) {
            heap.set(0, last);
            heapify(0); // sift down
        }

        return root;
    }

    public int size() {
        return heap.size();
    }

    public boolean isEmpty() {
        return heap.isEmpty();
    }

    // heapify (siftDown)
    public void heapify(int index) {
        int n = heap.size();
        int i = index;

        while (true) {
            int left = 2 * i + 1;
            int right = 2 * i + 2;
            int smallest = i;

            if (left < n && heap.get(left) < heap.get(smallest))
                smallest = left;

            if (right < n && heap.get(right) < heap.get(smallest))
                smallest = right;

            if (smallest == i) break;

            swap(i, smallest);
            i = smallest;
        }
    }

    // siftUp logic for min-heap
    private void siftUp(int index) {
        int i = index;
        while (i > 0) {
            int parent = (i - 1) / 2;
            if (heap.get(i) < heap.get(parent)) {
                swap(i, parent);
                i = parent;
            } else break;
        }
    }

    private void swap(int i, int j) {
        int temp = heap.get(i);
        heap.set(i, heap.get(j));
        heap.set(j, temp);
    }

    // Build heap from an array (O(n))
    public void buildHeap(List<Integer> arr) {
        heap = new ArrayList<>(arr);
        for (int i = (heap.size() / 2) - 1; i >= 0; i--) {
            heapify(i);
        }
    }
}

// Demo
class H {
    public static void main(String[] args) {

        Minheap mh = new Minheap();
        mh.insert(10);
        mh.insert(4);
        mh.insert(15);
        mh.insert(20);
        mh.insert(0);

        System.out.println("peek = " + mh.peek()); // 0
        System.out.println("poll = " + mh.poll()); // 0
        System.out.println("peek after poll = " + mh.peek()); // 4

        // Build heap from existing list
        Minheap mh2 = new Minheap();
        List<Integer> list = List.of(5, 3, 8, 1, 9, 2);
        mh2.buildHeap(list);

        System.out.println("Elements in sorted order:");
        while (!mh2.isEmpty()) {
            System.out.print(mh2.poll() + " "); // 1 2 3 5 8 9
        }
    }
}
