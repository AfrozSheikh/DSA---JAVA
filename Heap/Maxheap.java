package Heap;

import java.util.ArrayList;
import java.util.List;

public class Maxheap {
    List<Integer> heap;

    public Maxheap() {
        heap = new ArrayList<>();
    }

    // Return the max element (root)
    public int peek() {
        if (heap.isEmpty()) throw new IllegalStateException("Heap is empty");
        return heap.get(0);
    }

    // Insert value into heap (sift up)
    public void insert(int val) {
        heap.add(val);
        siftUp(heap.size() - 1);
    }

    // Remove and return max element (root)
    public int poll() {
        if (heap.isEmpty()) throw new IllegalStateException("Heap is empty");
        int root = heap.get(0);
        int last = heap.remove(heap.size() - 1);
        if (!heap.isEmpty()) {
            heap.set(0, last);
            heapify(0); // sift down from root
        }
        return root;
    }

    public int size() {
        return heap.size();
    }

    public boolean isEmpty() {
        return heap.isEmpty();
    }

    // siftDown / heapify from index i (ensure subtree rooted at i is max-heap)
    public void heapify(int index) {
        int n = heap.size();
        int i = index;
        while (true) {
            int left = 2 * i + 1;
            int right = 2 * i + 2;
            int largest = i;

            if (left < n && heap.get(left) > heap.get(largest)) largest = left;
            if (right < n && heap.get(right) > heap.get(largest)) largest = right;

            if (largest == i) break;

            swap(i, largest);
            i = largest;
        }
    }

    // helper: siftUp for insert
    private void siftUp(int index) {
        int i = index;
        while (i > 0) {
            int parent = (i - 1) / 2;
            if (heap.get(i) > heap.get(parent)) {
                swap(i, parent);
                i = parent;
            } else {
                break;
            }
        }
    }

    private void swap(int i, int j) {
        int tmp = heap.get(i);
        heap.set(i, heap.get(j));
        heap.set(j, tmp);
    }

    // Optional: build heap from existing list (O(n))
    public void buildHeap(List<Integer> arr) {
        heap = new ArrayList<>(arr);
        for (int i = (heap.size() / 2) - 1; i >= 0; i--) {
            heapify(i);
        }
    }
}

// Demo main (non-public class in same file)
class H {
    public static void main(String[] args) {
        Maxheap mh = new Maxheap();
        mh.insert(10);
        mh.insert(4);
        mh.insert(15);
        mh.insert(20);
        mh.insert(0);
        System.out.println("peek = " + mh.peek()); // 20
        System.out.println("poll = " + mh.poll()); // 20
        System.out.println("peek after poll = " + mh.peek()); // 15
        System.out.println("size = " + mh.size()); // 4

        // buildHeap demo
        Maxheap mh2 = new Maxheap();
        List<Integer> list = List.of(3, 1, 6, 5, 2, 4);
        mh2.buildHeap(list);
        while (!mh2.isEmpty()) {
            System.out.print(mh2.poll() + " "); // 6 5 4 3 2 1
        }
    }
}
