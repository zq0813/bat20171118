package com.test.course;

/**
 * Created by mengzhg on 2017/11/18 11:33.
 */
public class Person {

    private String name;
    protected static String idCard = "2222";
    private int weight = 100;

    int age = 90;
    String location = "亚洲";


    public void write() {
        System.out.println("Person, age:" + age + ", location:" + location);
    }

    public void read() {
        System.out.println("Person,Hello read");
    }


    static {
        idCard = "3333";
        System.out.println("Person.static run...");
    }

    public Person() {
        System.out.println("Person.construct run...");
        this.name = "default name";
    }

    public Person(String name) {
        System.out.println("Person.construct run...");
        this.name = name;
    }

    public static void printIdCard() {
        System.out.println("Person.printIdCard run ...");
    }

    public String descripe() {
        System.out.println("Person.descripe run ...");
        return "i am " + name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }
}
