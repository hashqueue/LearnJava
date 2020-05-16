package com.abc.part4.chapterexercises;

import java.util.Scanner;

/**
 * @Auther: ABC
 * @Date: 2020/5/16 18:06
 * @Description:
 */
public class AnimalTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("欢迎您来到E宠之家！");
        System.out.println("***********************");
        //输入宠物名称
        System.out.print("请输入要领养宠物的名字：");
        String name = scanner.next();
        System.out.println("请选择要领养的宠物类型(键入数字序号即可)：\n1.猫咪\n2.猪猪");
        int choice = scanner.nextInt();
        if (choice == 1) {
            System.out.println("请选择猫咪的品种(键入数字序号即可)：\n1.波斯猫\n2.挪威的森林");
            String strain;
            int choice2 = scanner.nextInt();
            if (choice2 == 1) {
                strain = "波斯猫";
                Cat cat = new Cat(name, strain);
                while (true) {
                    System.out.println("请选择您的操作:\n0.退出\n1.查看宠物信息\n2.给宠物喂食\n3.陪宠物玩耍");
                    int choice3 = scanner.nextInt();
                    if (choice3 == 1) {
                        System.out.println(cat.selfIntroduction());
                    } else if (choice3 == 2) {
                        cat.eat();
                    } else if (choice3 == 3) {
                        cat.play();
                    } else if (choice3 == 0) {
                        break;
                    } else {
                        System.out.println("输入数字序号有误!");
                    }
                }
            } else if (choice2 == 2) {
                strain = "挪威的森林";
                Cat cat1 = new Cat(name, strain);
                while (true) {
                    System.out.println("请选择您的操作:\n0.退出\n1.查看宠物信息\n2.给宠物 喂食\n3.陪宠物玩耍");
                    int choice3 = scanner.nextInt();
                    if (choice3 == 1) {
                        System.out.println(cat1.selfIntroduction());
                    } else if (choice3 == 2) {
                        cat1.eat();
                    } else if (choice3 == 3) {
                        cat1.play();
                    } else if (choice3 == 0) {
                        break;
                    } else {
                        System.out.println("输入数字序号有误!");
                    }
                }
            }
        } else if (choice == 2) {
            System.out.println("请选择猪猪的性别(键入数字序号即可)：\n1.猪MM\n2.猪GG");
            String sex;
            int choice2 = scanner.nextInt();
            if (choice2 == 1) {
                sex = "猪MM";
                Pig pig = new Pig(name, sex);
                while (true) {
                    System.out.println("请选择您的操作:\n0.退出\n1.查看宠物信息\n2.给宠物喂食\n3.陪宠物玩耍");
                    int choice3 = scanner.nextInt();
                    if (choice3 == 1) {
                        System.out.println(pig.selfIntroduction());
                    } else if (choice3 == 2) {
                        pig.eat();
                    } else if (choice3 == 3) {
                        pig.play();
                    } else if (choice3 == 0) {
                        break;
                    } else {
                        System.out.println("输入数字序号有误!");
                    }
                }
            } else if (choice2 == 2) {
                sex = "猪GG";
                Pig pig1 = new Pig(name, sex);
                while (true) {
                    System.out.println("请选择您的操作:\n0.退出\n1.查看宠物信息\n2.给宠物 喂食\n3.陪宠物玩耍");
                    int choice3 = scanner.nextInt();
                    if (choice3 == 1) {
                        System.out.println(pig1.selfIntroduction());
                    } else if (choice3 == 2) {
                        pig1.eat();
                    } else if (choice3 == 3) {
                        pig1.play();
                    } else if (choice3 == 0) {
                        break;
                    } else {
                        System.out.println("输入数字序号有误!");
                    }
                }
            }
        } else {
            System.out.println("输入数字序号有误!");
        }
    }
}