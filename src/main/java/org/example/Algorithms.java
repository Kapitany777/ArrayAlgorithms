package org.example;

public class Algorithms
{
    public static <T> void reverse(T[] array)
    {
        for (int i = 0; i < array.length / 2; i++)
        {
            T tmp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = tmp;
        }
    }
}
