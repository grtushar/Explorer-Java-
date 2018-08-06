package com.prime.Java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;

/**
 * Created by Golam Rahman Tushar on 8/3/2018.
 */
class Numbers {
    public static boolean isMoreThanFifty(int n1, int n2) {
        return (n1 + n2) > 50;
    }

    public static List<Integer> findNumbers(List<Integer> list, BiPredicate<Integer, Integer> predicate) {
        List<Integer> newList = new ArrayList<>();
        for(Integer i : list) {
            if(predicate.test(i, i + 10)) {
                newList.add(i);
            }
        }
        return newList;
    }
}
public class MethodReferrence1 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(12, 13, 14, 1, 34, 3, 7, 23);

        // using anonymous class
        Numbers.findNumbers(numbers, new BiPredicate<Integer, Integer>() {
            @Override
            public boolean test(Integer a, Integer b) {
                return Numbers.isMoreThanFifty(a, b);
            }
        });

        // using lambda expression
        Numbers.findNumbers(numbers, (a, b) -> Numbers.isMoreThanFifty(a, b));

        // using method reference (Class::staticMethod)
        Numbers.findNumbers(numbers, Numbers::isMoreThanFifty);
    }
}
