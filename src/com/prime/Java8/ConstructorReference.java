package com.prime.Java8;

/**
 * Created by Golam Rahman Tushar on 8/5/2018.
 */

interface PersonFactory<P extends Person> {
    P create(String firstName, String LastName);
}

class Person {
    private String firstName, LastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        LastName = lastName;
    }
}

public class ConstructorReference {
    public static void main(String[] args) {
        PersonFactory<Person> personFactory = new PersonFactory<Person>() {
            @Override
            public Person create(String firstName, String LastName) {
                return new Person(firstName, LastName);
            }
        };

        PersonFactory<Person> personFactoryUsingLambda = (firstName, LastName) -> new Person(firstName, LastName);

        PersonFactory<Person> personFactoryUsingConRef = Person::new;
    }
}
