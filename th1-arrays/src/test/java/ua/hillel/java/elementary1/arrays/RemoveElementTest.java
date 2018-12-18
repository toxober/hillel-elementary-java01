package ua.hillel.java.elementary1.arrays;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.List;

@RunWith(Parameterized.class)
public class RemoveElementTest {
    @Parameterized.Parameters
    public static List<Object[]> parameters() {
        return Arrays.asList(new Object[][]{
                {new int[]{1, 3, 5}, 3, new int[]{1, 5}},
                {new int[]{1, 3, 5}, 6, new int[]{1, 3, 5}},
                {new int[]{}, 6, new int[]{}},
                {new int[]{1, 3, 3, 3, 5}, 3, new int[]{1, 3, 3, 5}},
                {new int[]{1, 3, 3, 3, 5}, 5, new int[]{1, 3, 3, 3}},
                {new int[]{1, 3, 3, 3, 5}, 1, new int[]{3, 3, 3, 5}},
                });
    }

    private int[] array;
    private int target;
    private int[] expected;

    public RemoveElementTest(int[] array, int target, int[] expected) {
        this.array = array;
        this.target = target;
        this.expected = expected;
    }

    @Test
    public void removeFirstElement() {
        //Assert.assertArrayEquals(expected, RemoveElement.removeFirstElement(array, target));
    }
}