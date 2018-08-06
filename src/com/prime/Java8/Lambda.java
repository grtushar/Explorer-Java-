package com.prime.Java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Golam Rahman Tushar on 8/2/2018.
 */

class Something {
    char startsWith(String str) {
        return str.charAt(0);
    }
}

public class Lambda {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 6, 7, 8, 9, 10);
        List<Integer> evenNumbers = numbers.stream()
                .filter((Integer i) -> (i % 2) == 0)
                .collect(Collectors.toList());

        System.out.println(evenNumbers);

        List<String> names = Arrays.asList("abc", "cde", "bcd", "def", "abc");
        Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                return b.compareTo(a);
            }
        });

        Collections.sort(names, (a, b) -> a.compareTo(b));
        Collections.sort(names, String::compareTo);

        Collections.sort(names, Comparator.reverseOrder());

        System.out.println(names);


//        Something::startsWith
    }
}
