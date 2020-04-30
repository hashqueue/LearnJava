package com.abc.part_four;

public class DogTest {
    public static void main(String[] args) {
        System.out.println("*********Dog1*********");
        Dog1 d1 = new Dog1();
        // 调用Dog1里的run方法，创建两个Dog对象
        d1.run();
        /**
         * 这里产生了两个问题
         * 第一个问题：Dog1类中run()方法中调用jum()方法时是否一定需要一个Dog对象?
         * 第二个问题:是否一定需要重新创建一个Dog对象?
         * 第一个问题的答案是肯定的，因为没有使用static修饰的成员变量和方法都必须使用对象来调用 。
         * 第二个问题的答案是否定的，因为当程序调用run()法时，一定会提供一个Dog对象，这样就可以直接使用这个己经存在的Dog对象，而无须重新创建新Dog对象了.
         * 因此需要在run()方法中获得调用该方法的对象，通过this关键字就可以满足这个要求。
         *
         * this可以代表任何对象，当this出现在某个方法体中时，它所代表的对象是不确定的，但它的类型是确定的：它所代表的只能是当前类的实例，只有当这个方法被调用时，它所代表的对象才被确定下来：谁在调用这个方法，this就代表谁。
         * 因此将Dog1中run()方法中使用this关键字来调用jump()方法会更合适些。
         * 代码如Dog2所示
         */
        System.out.println("*********Dog2*********");
        Dog2 d2 = new Dog2();
        //调用Dog1里的run方法，只创建了一个Dog对象
        d2.run();
        /**
         * this关键字可以省略
         * 代码如Dog3所示
         */
        System.out.println("*********Dog3*********");
        Dog3 d3 = new Dog3();
        d3.run();


    }
}
