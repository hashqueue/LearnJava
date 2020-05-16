package com.abc.part4.chapterexercises;

/**
 * @author mi
 */
public class Student {
    private String name;
    private int age;
    private char gender;
    private String phone;
    private String address;
    private String email;

    public Student() {
        System.out.println("学生类默认无参构造器");
    }

    public Student(String name, int age, char gender, String phone, String address, String email) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.phone = phone;
        this.address = address;
        this.email = email;

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

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void eat() {
        System.out.println("学生吃饭");
    }

    public void play() {
        System.out.println("学生玩耍");
    }

    public void drink() {
        System.out.println("学生喝水");
    }

    public void sleep() {
        System.out.println("学生睡觉");
    }


    /**
     * 重写toString()方法
     *
     * @return 对象的所有属性
     */
    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", age=" + age + ", gender=" + gender + ", phone=" + phone + ", address=" + address + ", email=" + email + "}";
    }
}
