package com.zhangxiaofan.git;

/**
 * @author ZhangXiaoFan
 * @create 2019-11-24 21:45
 */
public class Person {
    private String name;
    private int age;
    private Birthday birthday;

    public Person() {
        birthday = new Birthday();
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        birthday = new Birthday();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
