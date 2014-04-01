package com.stogiapps.app;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class App {

    public static void main() {
        List<Integer> numbers = Arrays.asList(-2, -1, 0, 1, 2);

        System.out.println(numbers);

        numbers.sort((a, b) -> Math.abs(a) - Math.abs(b));

        System.out.println(numbers);
    }

}
