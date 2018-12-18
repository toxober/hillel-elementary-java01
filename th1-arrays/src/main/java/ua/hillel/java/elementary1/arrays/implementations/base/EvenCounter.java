package ua.hillel.java.elementary1.arrays.implementations.base;

import ua.hillel.java.elementary1.arrays.tasks.EvenNumbersCounter;

public class EvenCounter implements EvenNumbersCounter {

    @Override
    public int countEven(int[] array) {
        // arrays are objects - we have to check null!
        if (array == null) {
            return 0;
        }
        // array.length is synthetic field telling length of the array.
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            // array[i] - can get element by id. if id is out of range IndexOutOfRangeException will be thrown.
            if ((array[i] & 1) == 0) {
                count++;
            }
        }
        return count;
    }
}
