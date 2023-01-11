package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseTest
{
    @Test
    void reverseEmptyArray()
    {
        var array = new Integer[]{};

        Algorithms.reverse(array);

        assertArrayEquals(new Integer[]{}, array);
    }

    @Test
    void reverseArrayWithOneElement()
    {
        var array = new Integer[]{1};

        Algorithms.reverse(array);

        assertArrayEquals(new Integer[]{1}, array);
    }

    @Test
    void reverseArrayWithOddElements()
    {
        var array = new Integer[]{1, 2, 3, 4, 5};

        Algorithms.reverse(array);

        assertArrayEquals(new Integer[]{5, 4, 3, 2, 1}, array);
    }

    @Test
    void reverseArrayWithEvenElements()
    {
        var array = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8};

        Algorithms.reverse(array);

        assertArrayEquals(new Integer[]{8, 7, 6, 5, 4, 3, 2, 1}, array);
    }

    @Test
    void reverseStringArray()
    {
        var array = new String[]{"a", "b", "c"};

        Algorithms.reverse(array);

        assertArrayEquals(new String[]{"c", "b", "a"}, array);
    }
}