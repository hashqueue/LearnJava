package com.abc.part4;

public class Dog3 {
    public String dogName;

    public void jump() {
        System.out.println("Dog jump~");
    }

    public void run() {
        dogName = "小花花";
        jump();//假设Dog run的前提是Dog jump
        System.out.println("Dog run~");
    }
}
