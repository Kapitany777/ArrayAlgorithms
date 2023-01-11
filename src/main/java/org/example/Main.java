package org.example;

import java.util.Arrays;

public class Main
{
    public static void main(String[] args)
    {
        var a1 = new Integer[]{1, 2, 3, 4, 5};
        Algorithms.reverse(a1);
        Arrays.stream(a1).toList().forEach(System.out::println);
    }
}