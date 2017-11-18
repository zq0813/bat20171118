package com.test.course;

/**
 * Created by mengzhg on 2017/11/18 11:36.
 */
public class Zhangsan extends Person {

    private String name;

    int age = 10;

//    String location = "建大";

    static {
        System.out.println("Zhangsan.static run ....");
    }

    @Override
    public void read() {
        System.out.println("zhangsan,hello read");
    }

    @Override
    public void write() {
        super.write();
        System.out.println("Zhangsan, age:" + age + ", location:" + location);
    }

    public void sing(){
        System.out.println("zhangsan,hello sing");
    }


    public Zhangsan(String name) {
        System.out.println("zhangsan.construct run...");
    }

    public static void sport() {
        System.out.println("zhangsan.static.sport run...");
    }

//    @Override
//    public String descripe() {
//        super.descripe();
//        System.out.println("zhangsna.descripe run ...");
//        return "zhangsan's " + this.name;
//    }
}
