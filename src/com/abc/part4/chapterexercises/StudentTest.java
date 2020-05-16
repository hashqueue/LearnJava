package com.abc.part4.chapterexercises;

import java.util.Scanner;

/**
 * @author mi
 */
public class StudentTest {
    static Student[] arr = {new Student("小花花", 21, '女', "1008611", "北京市大兴区", "1008611@qq.com"),
            new Student("大花花", 25, '女', "1008612", "北京市海淀区", "1008612@qq.com"),
            new Student("小刚", 21, '男', "1008613", "北京市朝阳区", "1008613@qq.com")};

    static Scanner input = new Scanner(System.in);
    static String name = "name";
    static String email = "email";
    static String address = "address";

    public static String select(String type) {
        System.out.println("请输入您要查询的" + type);
        String data = input.nextLine();
        String noneData = "无法查询到关于" + data + "的相关通讯录信息。";
        String dataReturn = null;
        for (Student stu : arr) {
            if (type.equals(name)) {
                if (data.equals(stu.getName())) {
                    dataReturn = stu.toString();
                    break;
                } else {
                    dataReturn = noneData;
                }
            } else if (type.equals(email)) {
                if (data.equals(stu.getEmail())) {
                    dataReturn = stu.toString();
                    break;
                } else {
                    dataReturn = noneData;
                }
            } else if (type.equals(address)) {
                if (data.equals(stu.getAddress())) {
                    dataReturn = stu.toString();
                    break;
                } else {
                    dataReturn = noneData;
                }
            }
        }
        return dataReturn;
    }

    public static void main(String[] args) {
        while (true) {
            System.out.println("***********************分割线***********************\n请输入您要查询的人，可以键入以下数字序号进行查询\n1.name\n2.email\n3.address");
            String strNum = input.nextLine();
            int num = Integer.parseInt(strNum);
            switch (num) {
                case 1: {
                    System.out.println(select("name"));
                    break;
                }
                case 2: {
                    System.out.println(select("email"));
                    break;
                }
                case 3: {
                    System.out.println(select("address"));
                    break;
                }
                default: {
                    System.out.println("输入数字序号有误!");
                }
            }
        }

    }
}
