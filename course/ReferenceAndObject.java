package com.test.course;

/**
 * Created by mengzhg on 2017/11/18 13:34.
 */
public class ReferenceAndObject {

    public static void main(String[] args) {

        Person person1 = new Person("jack");

        Person personRef = person1;

        personRef.setName("robin");

        System.out.println(person1.getName());
        System.out.println(personRef.getName());

        System.out.println(personRef.getWeight());


    }

}
