package com.abc.part4.chapterexercises;

/**
 * @Auther: ABC
 * @Date: 2020/5/16 17:26
 * @Description:
 */
public class Cat extends Animal {
    /**
     * strain 品种
     */
    private String strain;

    /**
     * 构造方法
     *
     * @param name   宠物名字
     * @param strain 品种
     */
    public Cat(String name, String strain) {
        super(name);
        this.strain = strain;
    }

    /**
     * getter和setter方法
     */
    public String getStrain() {
        return strain;
    }

    public void setStrain(String strain) {
        this.strain = strain;
    }

    /**
     * 自我介绍
     */
    @Override
    public String selfIntroduction() {
        return super.selfIntroduction() + "我是一只纯种的" + this.strain + "。";
    }
}
