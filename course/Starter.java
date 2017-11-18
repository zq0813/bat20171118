package com.test.course;

/**
 * Created by mengzhg on 2017/11/18 11:55.
 */
public class Starter {

    public static void main(String[] args) {

        Person p = new Person("person");
        Person zhangsan = new Zhangsan("zhangsan");
        Zhangsan zhangsan1 = new Zhangsan("zhangsan1");

        p.write();
        p.read();

        zhangsan.write();
        zhangsan.read();
            ((Zhangsan) zhangsan).sing();

//        ((Zhangsan)p).sing();

                zhangsan1.sing();

    }

}
