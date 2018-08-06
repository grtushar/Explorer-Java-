package com.prime.Java8;

/**
 * Created by Golam Rahman Tushar on 8/5/2018.
 */

interface Converter<F, T> {
    T convert(F from);
}

public class MethodReference2 {
    public static void main(String[] args) {
        Converter<String, Integer> converter = new Converter<String, Integer>() {
            @Override
            public Integer convert(String from) {
                return Integer.valueOf(from);
            }
        };

        System.out.println(converter.convert("123"));

        Converter<String, Integer> converterUsingLambda = from -> Integer.valueOf(from);
        System.out.println(converterUsingLambda.convert("231"));

        Converter<String, Integer> converterUsingMethRef = Integer :: valueOf;
        System.out.println(converterUsingMethRef.convert("123"));
    }
}
