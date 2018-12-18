package ua.hillel.java.elementary1.arrays.implementations.base;

import ua.hillel.java.elementary1.arrays.tasks.BinarySearcher;

public class BinarySearchElements implements BinarySearcher {
    /**
     * Find position of the element in the sorted array or return -1-pos to inserted.
     *
     * @param array  the array
     * @param target the target
     * @return the pos of element in the array of return -1-pos where to insert element.
     */
    public int findPos(int[] array, int target) {
        int s = 0, e = array.length;
        while (s < e) {
            int mid = (s + e) >> 1;
            if (array[mid] == target) {
                return mid;
            }
            // check where to go next and where to find it.
            if (array[mid] < target) {
                s = mid + 1;
            } else {
                e = mid;
            }
        }
        return -1 - e;
    }
}
