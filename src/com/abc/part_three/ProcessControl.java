package com.abc.part_three;

public class ProcessControl {
    public static void main(String[] args) {
        /**
         * 流程控制
         */
        /**
         * if语句
         * if语句使用布尔表达式或布尔值作为分支条件来进行分支控制，if语句有以下三种形式
         *
         * 第一种：
         * if (logic expression)
         * {
         *     statement...
         * }
         */
//        int age = 25;
//        if (age > 23) {
//            System.out.println("该结婚买房了!");//该结婚买房了!
//        }
        /**
         * 第二种：
         * if (logic expression)
         * {
         *     statement...
         * }
         * else
         * {
         *     statement...
         * }
         */
//        int age = 21;
//        if (age > 23) {
//            System.out.println("该结婚买房了!");
//        } else {
//            System.out.println("年龄还小，要好好努力学习啊!");//年龄还小，要好好努力学习啊!
//        }
        /**
         * 第三种：
         * if (logic expression)
         * {
         *     statement...
         * }
         * else if (logic expression)
         * {
         *     statement...
         * }
         * ...//可以有0个或多个else if语句
         * else//最后的else语句也可以省略
         * {
         *     statement...
         * }
         */
//        int age = 30;
//        if (age == 23) {
//            System.out.println("该结婚买房了!");
//        }else if (age == 20) {
//            System.out.println("原来你才20岁啊，太小了，不过也要好好珍惜啊!");//原来你才20岁啊，太小了，不过也要好好珍惜啊!
//        }else if (age == 30){
//            ;//一个分号表示空语句，在此处的含义是如果age==30，什么也不做。
//        } else {
//            System.out.println("年龄还小，要好好努力学习啊!");//年龄还小，要好好努力学习啊!
//        }
        /**
         * 上面if语句的3种形式中，放在if之后括号里的只能是一个逻辑表达式，即这个表达式的返回值只能是true或false.
         * 在使用 if...else 语句时有一条基本规则:总是优先把包含范围小的条件放在前面处理
         * 例如age>60和age>20两个条件，明显age>60的范围更小，所以应该先处理age>60的情况
         */
        /**
         *Java 增强后的 switch 分支语句
         *switch 语句由一个控制表达式和多个 case 标签组成
         * 和if语句不同的是，switch语句后面的控制表达式的数据类型只能是 byte、short、char、int四种整数类型，枚举类型和 java.lang.String类型(从Java7才允许)，不能是boolean类型。
         * switch 语句往往需要在 case 标签后紧跟一个代码块， case 标签作为这个代码块的标识 switch 语句的语法格式如下:
         * switch (expression)
         * {
         *     case condition1:
         *     {
         *         statement(s)
         *         break;
         *     }
         *     case condition2:
         *     {
         *         statement(s)
         *         break;
         *     }
         *     case conditionN:
         *     {
         *         statement(s)
         *         break;
         *     }
         *     default :
         *     {
         *         statement(s)
         *     }
         * }
         * 这种分支语句的执行是先对 expression 求值，然后依次匹配 condition1、condition2、conditionN等值
         * 遇到匹配的值即执行对应的执行体;如果所有 case 标签后的值都不与 expression 表达式的值相等
         * 则执行 default 标签后的代码块
         */
//        int a = 5 * 3;
//        switch (a) {
//            case 2: {
//                System.out.printf("5 * 3的结果是：%d", 2);
//                break;
//            }
//            case 5: {
//                System.out.printf("5 * 3的结果是：%d", 5);
//                break;
//            }
//            case 15: {
//                System.out.printf("5 * 3的结果是：%d", 15);//5 * 3的结果是：15
//                break;
//            }
//            default: {
//                System.out.printf("5 * 3的结果是：%d", 10);
//            }
//        }
        /**
         * Java7增强了 switch 语句的功能，允许 switch 语句的控制表达式是 java.lang.String 类型的变量或表达式
         * 只能是 java.lang.String 类型，不能是StringBuffer或StringBuilder这两种字符串类型
         */
//        String season = "秋天";//我也不知道现在是什么天啊!
////        String season1 = "秋";//我也不知道现在是什么天啊!
//        switch (season){
//            case "春天":
//            {
//                System.out.println("现在是春天啊!");
//                break;
//            }
//            case "夏天":
//            {
//                System.out.println("现在是夏天啊!");
//                break;
//            }
//            case "秋天":
//            {
//                System.out.println("现在是秋天啊!");
//                break;//如果不加break将会连着满足当前case的之后条件下的代码块一起打印
//                /*
//                不加break将会输出：
//                现在是秋天啊!
//                现在是冬天啊!
//                 */
//            }
//            case "冬天":
//            {
//                System.out.println("现在是冬天啊!");
//                break;
//            }
//            default:{
//                System.out.println("我也不知道现在是什么天啊!");
//            }
//        }
        /**
         *使用switch语句时，有两个值得注意的地方 :
         * 第一地方 witch 语句后的 expression表达式的数据类型只能是 byte、 short、 char 、int 四种整数类型,String (Java7才支持)和枚举类型;
         * 第二地方是如果省略了case后代码块的 break ，将达不到预期效果
         */

    }
}
