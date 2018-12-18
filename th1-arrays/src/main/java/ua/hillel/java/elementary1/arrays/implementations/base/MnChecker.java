package ua.hillel.java.elementary1.arrays.implementations.base;

import ua.hillel.java.elementary1.arrays.tasks.MonotonicChecker;

public class MnChecker implements MonotonicChecker {
    @Override
    public boolean checkIfMonotonic(int[] array) {
        if (array == null || array.length == 0) {
            return false;
        }
        int idx = 1;
        while (array[idx] == array[idx - 1]) {
            idx++;
        }
        int sign = 0;
        for (; idx < array.length; idx++) {
            int t = (int) Math.signum(array[idx] - array[idx - 1]);
            if (sign == 0) {
                sign = t;
            }
            if (sign != t) {
                return false;
            }
        }
        return sign != 0;
    }
}
