package com.prime.Java8;

/**
 * Created by Golam Rahman Tushar on 8/6/2018.
 */
public class LambdaScopes {
    static int staticVariable = 3;
    int instanceField = 3;

    public static void main(String[] args) {
        // Accessing local final variables
        final int localVariable = 1;

        Converter<Integer, String> stringIntegerConverter2 = new Converter<Integer, String>() {
            @Override
            public String convert(Integer from) {
                return String.valueOf(localVariable + from);
            }
        };
        System.out.println(stringIntegerConverter2.convert(2));

        Converter<Integer, String> stringIntegerConverter = (from -> String.valueOf(localVariable + from));
        System.out.println(stringIntegerConverter.convert(2));

        // Accessing local variable
        int localVariable2 = 1;
        Converter<Integer, String> stringIntegerConverter3 = new Converter<Integer, String>() {
            @Override
            public String convert(Integer from) {
                /* localVariable2 = 3; Won't work, localVariable2 have to be implicitly final for the code to compile */
                return String.valueOf(localVariable2 + from);
            }
        };

        /* localVariable2 = 3; Won't work, localVariable2 have to be implicitly final for the code to compile */

        System.out.println(stringIntegerConverter3.convert(2));

        Converter<Integer, String> stringIntegerConverter4 = (from -> {
            /* localVariable2 = 3; Won't work, localVariable2 have to be implicitly final for the code to compile */
            // but static and instance variables can be changed
            new LambdaScopes().instanceField = 4;
            staticVariable = 4;
            return String.valueOf(localVariable2 + from);
        });
        System.out.println(stringIntegerConverter4.convert(2));
    }
}
