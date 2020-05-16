package com.abc.part4.chapterexercises;

/**
 * @Auther: ABC
 * @Date: 2020/5/16 12:34
 * @Description:
 */
public class TransportationTest {
    public static void main(String[] args) {
        Car car = new Car("汽车", "白色", 5, "公路");
        System.out.println(car.toString());
        Train train = new Train("火车", "黑色", 1000, "铁轨");
        System.out.println(train.toString());
        /**
         * 输出:
         * 我是交通工具，作用是方便人们的出行。
         * 我是汽车, 我的颜色是白色, 我的长度是5米, 我可以在公路上跑。
         * 我是火车, 我的颜色是黑色, 我的长度是1000米, 我可以在铁轨上跑。
         */
    }
}
