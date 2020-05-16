package com.abc.part4.chapterexercises;

/**
 * @Auther: ABC
 * @Date: 2020/5/16 17:29
 * @Description:
 */
public class Pig extends Animal {
    /**
     * sex 性别
     */
    private String sex;

    /**
     * 构造方法
     *
     * @param name 名字
     * @param sex  性别
     */
    public Pig(String name, String sex) {
        super(name);
        this.sex = sex;
    }

    /**
     * getter和setter方法
     */
    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    /**
     * 自我介绍
     */
    @Override
    public String selfIntroduction() {
        return super.selfIntroduction() + "我是一只胖胖的" + this.sex + "。";
    }


}
