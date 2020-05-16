package com.abc.part4.chapterexercises;

/**
 * @Auther: ABC
 * @Date: 2020/5/16 17:18
 * @Description:
 */


public class Animal {
    /**
     * name 名字
     * strength 体能值
     * mood 心情值
     */
    private String name;
    private int strength = 100;
    private int mood = 20;

    /**
     * 构造方法
     *
     * @param name 宠物名字
     */
    public Animal(String name) {
        this.name = name;
    }

    /**
     * getter和setter方法
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getMood() {
        return mood;
    }

    public void setMood(int mood) {
        this.mood = mood;
    }

    /**
     * 自我介绍
     */
    public String selfIntroduction() {
        return "我叫" + this.name + ", 我目前的体力值是" + this.strength + ", 心情值是" + this.mood + "。";
    }

    /**
     * 吃
     */
    public void eat() {
        if (strength > 120) {
            System.out.println(this.name + "需要多运动哦!");
        } else {
            strength += 10;
            System.out.println(this.name + "吃饱啦！体力值增加10，目前值为 " + strength + "。");
        }

    }

    /**
     * 玩耍
     */
    public void play() {
        if (strength < 60) {
            System.out.println(this.name + "生病了!");
        } else {
            strength -= 10;
            mood += 5;
            System.out.println(this.name + "正在跟主人玩耍。目前体力值为" + strength + ", 心情值为" + mood + "。");
        }

    }


}
