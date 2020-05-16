package com.abc.part3;

import java.util.Random;
import java.util.Scanner;

/**
 * @Auther: ABC
 * @Date: 2020/5/16 16:44
 * @Description:
 */
public class MultiplicationLearningSoftware {
    public static void main(String[] args) {
        while (true) {
            Random random = new Random();
            //随机生成[1,9]范围内的随机数
            int num1 = random.nextInt(9) + 1;
            int num2 = random.nextInt(9) + 1;
            System.out.println(num1 + " * " + num2 + " = ?");
            int actualAnswer = num1 * num2;
            Scanner scanner = new Scanner(System.in);
            while (true) {
                System.out.println("请输入你的答案>>>");
                int answer = scanner.nextInt();
                if (answer == actualAnswer) {
                    System.out.println("恭喜你答对了!你真棒!");
                    break;
                } else {
                    System.out.println("答错了，再动动你的小脑筋试试吧!");
                }
            }

        }

    }
}
